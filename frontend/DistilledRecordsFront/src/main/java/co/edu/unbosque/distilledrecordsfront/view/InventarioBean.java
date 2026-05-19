package co.edu.unbosque.distilledrecordsfront.view;

import co.edu.unbosque.distilledrecordsfront.model.InventarioDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceInventario;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("inventarioBean")
@ViewScoped
public class InventarioBean implements Serializable {

    private InventarioDTO inventarioDto;

    @Inject
    private InterfaceInventario inventarioService;

    @PostConstruct
    public void init(){
        inventarioDto = new InventarioDTO();
    }

    public void registrarInventario() throws JsonProcessingException {
        inventarioService.registrar(inventarioDto);
        inventarioDto = new InventarioDTO();
    }

    public List<InventarioDTO> listarInventarios() throws JsonProcessingException {
        return inventarioService.listar();
    }

    public InventarioDTO getInventarioDto() {
        return inventarioDto;
    }

    public void setInventarioDto(InventarioDTO inventarioDto) {
        this.inventarioDto = inventarioDto;
    }
}
