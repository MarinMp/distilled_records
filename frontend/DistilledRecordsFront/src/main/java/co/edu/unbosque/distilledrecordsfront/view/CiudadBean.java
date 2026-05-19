package co.edu.unbosque.distilledrecordsfront.view;

import co.edu.unbosque.distilledrecordsfront.model.CiudadDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceCiudad;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("ciudadBean")
@ViewScoped
public class CiudadBean implements Serializable {

    private CiudadDTO ciudadDto;

    @Inject
    private InterfaceCiudad ciudadService;

    @PostConstruct
    public void init(){
        ciudadDto = new CiudadDTO();
    }

    public void registrarCiudad() throws JsonProcessingException {
        ciudadService.registrar(ciudadDto);
        ciudadDto = new CiudadDTO();
    }

    public List<CiudadDTO> listarCiudades() throws JsonProcessingException {
        return ciudadService.listar();
    }

    public CiudadDTO getCiudadDto() {
        return ciudadDto;
    }

    public void setCiudadDto(CiudadDTO ciudadDto) {
        this.ciudadDto = ciudadDto;
    }
}
