package co.edu.unbosque.distilledrecordsfront.services;

import co.edu.unbosque.distilledrecordsfront.model.EmpleadoDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceEmpleado;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class EmpleadoService implements InterfaceEmpleado {

    private ApiService apiService;

    public EmpleadoService() {
        apiService = new ApiService();
    }

    @Override
    public EmpleadoDTO registrar(EmpleadoDTO empleado) throws JsonProcessingException {
        return apiService.registrar("empleados", empleado, EmpleadoDTO.class);
    }

    @Override
    public List<EmpleadoDTO> listar() throws JsonProcessingException {
        return apiService.listar("empleados", EmpleadoDTO.class);
    }
}