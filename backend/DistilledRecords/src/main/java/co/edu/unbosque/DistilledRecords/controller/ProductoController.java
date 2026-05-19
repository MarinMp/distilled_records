package co.edu.unbosque.DistilledRecords.controller;

import co.edu.unbosque.DistilledRecords.model.dtos.ProductoDTO;
import co.edu.unbosque.DistilledRecords.services.ProductoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/licorera/api")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/productos")
    public ResponseEntity<List<ProductoDTO>> listarProductos() {
        System.out.println("Lista de productos");
        return new ResponseEntity<>(productoService.buscarProductos(), HttpStatus.OK);
    }

    @PostMapping("/productos")
    public ResponseEntity<ProductoDTO> registrarProducto(@RequestBody ProductoDTO producto) {
        System.out.println("Producto registrado");
        return new ResponseEntity<>(productoService.registrarProducto(producto), HttpStatus.CREATED);
    }
}

