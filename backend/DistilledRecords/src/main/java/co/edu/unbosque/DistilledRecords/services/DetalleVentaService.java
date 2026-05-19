package co.edu.unbosque.DistilledRecords.services;

import co.edu.unbosque.DistilledRecords.model.dtos.DetalleVentaDTO;
import co.edu.unbosque.DistilledRecords.model.entities.DetalleVenta;
import co.edu.unbosque.DistilledRecords.repositories.DetalleVentaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DetalleVentaService {

    private final DetalleVentaRepository detalleVentaRepository;
    private ModelMapper modelMapper = new ModelMapper();

    public DetalleVentaService(DetalleVentaRepository repository) {
        this.detalleVentaRepository = repository;
    }

    public List<DetalleVentaDTO> buscarDetalleVentas(){
        List<DetalleVentaDTO> listaDetalleVentas = new ArrayList<>();
        List<DetalleVenta> detalleVentasBD = detalleVentaRepository.findAll();
        for (DetalleVenta detalleVenta : detalleVentasBD) {
            listaDetalleVentas.add(modelMapper.map(detalleVenta, DetalleVentaDTO.class));
        }
        return listaDetalleVentas;
    }

    public DetalleVentaDTO registrarDetalleVenta(DetalleVentaDTO detalleVenta) {
        return modelMapper.map(
                detalleVentaRepository.save(modelMapper.map(detalleVenta, DetalleVenta.class)),
                DetalleVentaDTO.class
        );
    }
}

