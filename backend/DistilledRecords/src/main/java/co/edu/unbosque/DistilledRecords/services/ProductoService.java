package co.edu.unbosque.DistilledRecords.services;

import co.edu.unbosque.DistilledRecords.model.dtos.ProductoDTO;
import co.edu.unbosque.DistilledRecords.model.entities.Producto;
import co.edu.unbosque.DistilledRecords.repositories.ProductoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository productoRepository;
    private ModelMapper modelMapper = new ModelMapper();

    public ProductoService(ProductoRepository repository) {
        this.productoRepository = repository;
    }

    public List<ProductoDTO> buscarProductos(){
        List<ProductoDTO> listaProductos = new ArrayList<>();
        List<Producto> productosBD = productoRepository.findAll();
        for (Producto producto : productosBD) {
            listaProductos.add(modelMapper.map(producto, ProductoDTO.class));
        }
        return listaProductos;
    }

    public ProductoDTO registrarProducto(ProductoDTO producto) {
        return modelMapper.map(
                productoRepository.save(modelMapper.map(producto, Producto.class)),
                ProductoDTO.class
        );
    }
}

