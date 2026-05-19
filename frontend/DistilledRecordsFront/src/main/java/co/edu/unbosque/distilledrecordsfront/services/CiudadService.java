package co.edu.unbosque.distilledrecordsfront.services;

import co.edu.unbosque.distilledrecordsfront.model.CiudadDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceCiudad;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class CiudadService implements InterfaceCiudad {

    private ApiService apiService;

    public CiudadService() {
        apiService = new ApiService();
    }

    @Override
    public CiudadDTO registrar(CiudadDTO ciudad) throws JsonProcessingException {
        return apiService.registrar("ciudades", ciudad, CiudadDTO.class);
    }

    @Override
    public List<CiudadDTO> listar() throws JsonProcessingException {
        return apiService.listar("ciudades", CiudadDTO.class);
    }
}

