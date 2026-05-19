package co.edu.unbosque.distilledrecordsfront.services;

import co.edu.unbosque.distilledrecordsfront.model.ResponseDTO;
import co.edu.unbosque.distilledrecordsfront.model.VentaDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceVenta;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class VentaService implements InterfaceVenta {

    private ApiService apiService;

    public VentaService() {
        apiService = new ApiService();
    }

    @Override
    public VentaDTO registrar(VentaDTO venta) throws JsonProcessingException {
        return apiService.registrar("ventas", venta, VentaDTO.class);
    }

    @Override
    public List<VentaDTO> listar() throws JsonProcessingException {
        return apiService.listar("ventas", VentaDTO.class);
    }

    @Override
    public ResponseDTO registrarVenta(String cliente, String empleado,
                                      Integer producto, Integer cantidad)
            throws JsonProcessingException {

        String params = "cliente=" + cliente +
                "&empleado=" + empleado +
                "&producto=" + producto +
                "&cantidad=" + cantidad;

        return apiService.postConParams("ventas/registrar", params, ResponseDTO.class);
    }
}

