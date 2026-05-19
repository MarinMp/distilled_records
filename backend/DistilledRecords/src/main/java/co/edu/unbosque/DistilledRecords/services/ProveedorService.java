package co.edu.unbosque.DistilledRecords.services;

import co.edu.unbosque.DistilledRecords.model.dtos.ProveedorDTO;
import co.edu.unbosque.DistilledRecords.model.entities.Proveedor;
import co.edu.unbosque.DistilledRecords.repositories.ProveedorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProveedorService {

    private final ProveedorRepository proveedorRepository;
    private ModelMapper modelMapper = new ModelMapper();

    public ProveedorService(ProveedorRepository repository) {
        this.proveedorRepository = repository;
    }

    public List<ProveedorDTO> buscarProveedores(){
        List<ProveedorDTO> listaProveedores = new ArrayList<>();
        List<Proveedor> proveedoresBD = proveedorRepository.findAll();
        for (Proveedor proveedor : proveedoresBD) {
            listaProveedores.add(modelMapper.map(proveedor, ProveedorDTO.class));
        }
        return listaProveedores;
    }

    public ProveedorDTO registrarProveedor(ProveedorDTO proveedor) {
        return modelMapper.map(
                proveedorRepository.save(modelMapper.map(proveedor, Proveedor.class)),
                ProveedorDTO.class
        );
    }
}
