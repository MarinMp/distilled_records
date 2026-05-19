package co.edu.unbosque.DistilledRecords.controller;

import co.edu.unbosque.DistilledRecords.model.dtos.ProveedorDTO;
import co.edu.unbosque.DistilledRecords.services.ProveedorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/licorera/api")
public class ProveedorController {

    private final ProveedorService proveedorService;

    public ProveedorController(ProveedorService proveedorService) {
        this.proveedorService = proveedorService;
    }

    @GetMapping("/proveedores")
    public ResponseEntity<List<ProveedorDTO>> listarProveedores() {
        System.out.println("Lista de proveedores");
        return new ResponseEntity<>(proveedorService.buscarProveedores(), HttpStatus.OK);
    }

    @PostMapping("/proveedores")
    public ResponseEntity<ProveedorDTO> registrarProveedor(@RequestBody ProveedorDTO proveedor) {
        System.out.println("Proveedor registrado");
        return new ResponseEntity<>(proveedorService.registrarProveedor(proveedor), HttpStatus.CREATED);
    }
}

