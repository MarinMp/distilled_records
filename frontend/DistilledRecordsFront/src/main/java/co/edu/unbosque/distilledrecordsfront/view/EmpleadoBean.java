package co.edu.unbosque.distilledrecordsfront.view;

import co.edu.unbosque.distilledrecordsfront.model.EmpleadoDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceEmpleado;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("empleadoBean")
@ViewScoped
public class EmpleadoBean implements Serializable {

    private EmpleadoDTO empleadoDto;

    @Inject
    private InterfaceEmpleado empleadoService;

    @PostConstruct
    public void init(){
        empleadoDto = new EmpleadoDTO();
    }

    public void registrarEmpleado() throws JsonProcessingException {
        empleadoService.registrar(empleadoDto);
        empleadoDto = new EmpleadoDTO();
    }

    public List<EmpleadoDTO> listarEmpleados() throws JsonProcessingException {
        return empleadoService.listar();
    }

    public EmpleadoDTO getEmpleadoDto() {
        return empleadoDto;
    }

    public void setEmpleadoDto(EmpleadoDTO empleadoDto) {
        this.empleadoDto = empleadoDto;
    }
}

