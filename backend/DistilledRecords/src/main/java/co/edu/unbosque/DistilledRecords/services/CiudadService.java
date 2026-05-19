package co.edu.unbosque.DistilledRecords.services;

import co.edu.unbosque.DistilledRecords.model.dtos.CiudadDTO;
import co.edu.unbosque.DistilledRecords.model.entities.Ciudad;
import co.edu.unbosque.DistilledRecords.repositories.CiudadRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CiudadService {

    private final CiudadRepository ciudadRepository;
    private ModelMapper modelMapper = new ModelMapper();

    public CiudadService(CiudadRepository ciudadRepository) {
        this.ciudadRepository = ciudadRepository;
    }

    public List<CiudadDTO> buscarCiudades(){
        List<CiudadDTO> listaCiudades = new ArrayList<>();
        List<Ciudad> ciudadesBD = ciudadRepository.findAll();
        for (Ciudad ciudad : ciudadesBD) {
            listaCiudades.add(modelMapper.map(ciudad, CiudadDTO.class));
        }
        return listaCiudades;
    }

    public CiudadDTO registrarCiudad(CiudadDTO ciudad) {
        return modelMapper.map(
                ciudadRepository.save(modelMapper.map(ciudad, Ciudad.class)),
                CiudadDTO.class
        );
    }
}
