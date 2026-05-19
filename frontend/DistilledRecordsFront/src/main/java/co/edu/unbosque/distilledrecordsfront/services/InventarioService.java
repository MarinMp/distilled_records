package co.edu.unbosque.distilledrecordsfront.services;

import co.edu.unbosque.distilledrecordsfront.model.InventarioDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceInventario;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class InventarioService implements InterfaceInventario {

    private ApiService apiService;

    public InventarioService() {
        apiService = new ApiService();
    }

    @Override
    public InventarioDTO registrar(InventarioDTO inventario) throws JsonProcessingException {
        return apiService.registrar("inventarios", inventario, InventarioDTO.class);
    }

    @Override
    public List<InventarioDTO> listar() throws JsonProcessingException {
        return apiService.listar("inventarios", InventarioDTO.class);
    }
}
