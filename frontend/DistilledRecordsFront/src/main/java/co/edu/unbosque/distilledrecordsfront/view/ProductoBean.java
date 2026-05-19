package co.edu.unbosque.distilledrecordsfront.view;

import co.edu.unbosque.distilledrecordsfront.model.ProductoDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceProducto;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("productoBean")
@ViewScoped
public class ProductoBean implements Serializable {

    private ProductoDTO productoDto;

    @Inject
    private InterfaceProducto productoService;

    @PostConstruct
    public void init() throws JsonProcessingException {
        productoDto = new ProductoDTO();
    }

    public void registrarProducto() throws JsonProcessingException {
        productoService.registrar(productoDto);
        productoDto = new ProductoDTO();
    }

    public List<ProductoDTO> listarProductos() throws JsonProcessingException {
        return productoService.listar();
    }

    public ProductoDTO getProductoDto() {
        return productoDto;
    }

    public void setProductoDto(ProductoDTO productoDto) {
        this.productoDto = productoDto;
    }
}
