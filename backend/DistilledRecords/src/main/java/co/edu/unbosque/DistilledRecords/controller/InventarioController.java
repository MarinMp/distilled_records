package co.edu.unbosque.DistilledRecords.controller;

import co.edu.unbosque.DistilledRecords.model.dtos.InventarioDTO;
import co.edu.unbosque.DistilledRecords.services.InventarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/licorera/api")
public class InventarioController {

    private final InventarioService inventarioService;

    public InventarioController(InventarioService inventarioService) {
        this.inventarioService = inventarioService;
    }

    @GetMapping("/inventarios")
    public ResponseEntity<List<InventarioDTO>> listarInventarios() {
        System.out.println("Lista de inventarios");
        return new ResponseEntity<>(inventarioService.buscarInventarios(), HttpStatus.OK);
    }

    @PostMapping("/inventarios")
    public ResponseEntity<InventarioDTO> registrarInventario(@RequestBody InventarioDTO inventario) {
        System.out.println("Inventario registrado");
        return new ResponseEntity<>(inventarioService.registrarInventario(inventario), HttpStatus.CREATED);
    }
}
