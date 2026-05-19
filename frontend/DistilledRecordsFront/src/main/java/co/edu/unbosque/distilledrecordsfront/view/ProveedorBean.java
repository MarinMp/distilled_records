package co.edu.unbosque.distilledrecordsfront.view;

import co.edu.unbosque.distilledrecordsfront.model.ProveedorDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceProveedor;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("proveedorBean")
@ViewScoped
public class ProveedorBean implements Serializable {

    private ProveedorDTO proveedorDto;

    @Inject
    private InterfaceProveedor proveedorService;

    @PostConstruct
    public void init(){
        proveedorDto = new ProveedorDTO();
    }

    public void registrarProveedor() throws JsonProcessingException {
        proveedorService.registrar(proveedorDto);
        proveedorDto = new ProveedorDTO();
    }

    public List<ProveedorDTO> listarProveedores() throws JsonProcessingException {
        return proveedorService.listar();
    }

    public ProveedorDTO getProveedorDto() {
        return proveedorDto;
    }

    public void setProveedorDto(ProveedorDTO proveedorDto) {
        this.proveedorDto = proveedorDto;
    }
}

