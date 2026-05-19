package co.edu.unbosque.distilledrecordsfront.services;

import co.edu.unbosque.distilledrecordsfront.model.DetalleVentaDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceDetalleVenta;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class DetalleVentaService implements InterfaceDetalleVenta {

    private ApiService apiService;

    public DetalleVentaService() {
        apiService = new ApiService();
    }

    @Override
    public DetalleVentaDTO registrar(DetalleVentaDTO detalleVenta) throws JsonProcessingException {
        return apiService.registrar("detalle-ventas", detalleVenta, DetalleVentaDTO.class);
    }

    @Override
    public List<DetalleVentaDTO> listar() throws JsonProcessingException {
        return apiService.listar("detalle-ventas", DetalleVentaDTO.class);
    }
}
