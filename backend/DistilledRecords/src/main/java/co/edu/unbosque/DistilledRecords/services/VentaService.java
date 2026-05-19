package co.edu.unbosque.DistilledRecords.services;

import co.edu.unbosque.DistilledRecords.model.dtos.ResponseDTO;
import co.edu.unbosque.DistilledRecords.model.dtos.VentaDTO;
import co.edu.unbosque.DistilledRecords.model.entities.Venta;
import co.edu.unbosque.DistilledRecords.repositories.VentaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VentaService {

    private final VentaRepository ventaRepository;
    private ModelMapper modelMapper = new ModelMapper();


    @Autowired
    private JdbcTemplate jdbcTemplate;


    public VentaService(VentaRepository repository) {
        this.ventaRepository = repository;
    }

    public List<VentaDTO> buscarVentas(){
        List<VentaDTO> listaVentas = new ArrayList<>();
        List<Venta> ventasBD = ventaRepository.findAll();
        for (Venta venta : ventasBD) {
            listaVentas.add(modelMapper.map(venta, VentaDTO.class));
        }
        return listaVentas;
    }

    public VentaDTO registrarVenta(VentaDTO venta) {
        return modelMapper.map(
                ventaRepository.save(modelMapper.map(venta, Venta.class)),
                VentaDTO.class
        );
    }


    public ResponseDTO registrarVenta(String cliente, String empleado,
                                      Integer producto, Integer cantidad) {

        try {
            String sql = "CALL sp_registrar_venta_simple(?,?,?,?,CURDATE())";

            jdbcTemplate.update(sql, cliente, empleado, producto, cantidad);

            return new ResponseDTO("Venta registrada correctamente", true);

        } catch (Exception e) {

            // Aquí capturas el SIGNAL de MySQL
            return new ResponseDTO("Error: " + e.getMessage(), false);
        }
    }
}
