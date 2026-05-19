package co.edu.unbosque.distilledrecordsfront.services;

import co.edu.unbosque.distilledrecordsfront.model.ProductoDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceProducto;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class ProductoService implements InterfaceProducto {

    private ApiService apiService;

    public ProductoService() {
        apiService = new ApiService();
    }

    @Override
    public ProductoDTO registrar(ProductoDTO producto) throws JsonProcessingException {
        return apiService.registrar("productos", producto, ProductoDTO.class);
    }

    @Override
    public List<ProductoDTO> listar() throws JsonProcessingException {
        return apiService.listar("productos", ProductoDTO.class);
    }
}

