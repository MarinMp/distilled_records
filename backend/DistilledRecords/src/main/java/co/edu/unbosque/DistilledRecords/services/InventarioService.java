package co.edu.unbosque.DistilledRecords.services;

import co.edu.unbosque.DistilledRecords.model.dtos.InventarioDTO;
import co.edu.unbosque.DistilledRecords.model.entities.Inventario;
import co.edu.unbosque.DistilledRecords.repositories.InventarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InventarioService {

    private final InventarioRepository inventarioRepository;
    private ModelMapper modelMapper = new ModelMapper();

    public InventarioService(InventarioRepository repository) {
        this.inventarioRepository = repository;
    }

    public List<InventarioDTO> buscarInventarios(){
        List<InventarioDTO> listaInventarios = new ArrayList<>();
        List<Inventario> inventariosBD = inventarioRepository.findAll();
        for (Inventario inventario : inventariosBD) {
            listaInventarios.add(modelMapper.map(inventario, InventarioDTO.class));
        }
        return listaInventarios;
    }

    public InventarioDTO registrarInventario(InventarioDTO inventario) {
        return modelMapper.map(
                inventarioRepository.save(modelMapper.map(inventario, Inventario.class)),
                InventarioDTO.class
        );
    }
}
