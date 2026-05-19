package co.edu.unbosque.distilledrecordsfront.services;

import co.edu.unbosque.distilledrecordsfront.model.ProveedorDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceProveedor;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class ProveedorService implements InterfaceProveedor {

    private ApiService apiService;

    public ProveedorService() {
        apiService = new ApiService();
    }

    @Override
    public ProveedorDTO registrar(ProveedorDTO proveedor) throws JsonProcessingException {
        return apiService.registrar("proveedores", proveedor, ProveedorDTO.class);
    }

    @Override
    public List<ProveedorDTO> listar() throws JsonProcessingException {
        return apiService.listar("proveedores", ProveedorDTO.class);
    }
}

