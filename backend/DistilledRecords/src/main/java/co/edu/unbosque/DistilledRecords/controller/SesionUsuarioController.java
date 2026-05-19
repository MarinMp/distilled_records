package co.edu.unbosque.DistilledRecords.controller;

import co.edu.unbosque.DistilledRecords.model.mongo.SesionUsuario;
import co.edu.unbosque.DistilledRecords.services.SesionUsuarioService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/licorera/api/mongo")
public class SesionUsuarioController {
    private final SesionUsuarioService service;

    public SesionUsuarioController(SesionUsuarioService s) {
        this.service = s;
    }

    @GetMapping("/sesiones")
    public ResponseEntity<List<SesionUsuario>> listar() {
        return new ResponseEntity<>(service.obtenerTodas(), HttpStatus.OK);
    }

    @GetMapping("/sesiones/activas")
    public ResponseEntity<List<SesionUsuario>> activas() {
        return new ResponseEntity<>(service.obtenerActivas(), HttpStatus.OK);
    }

    @PostMapping("/sesiones")
    public ResponseEntity<SesionUsuario> crear(@RequestBody SesionUsuario s) {
        return new ResponseEntity<>(service.crear(s), HttpStatus.CREATED);
    }

    @DeleteMapping("/sesiones/{token}")
    public ResponseEntity<Void> cerrar(@PathVariable String token) {
        service.cerrarSesion(token);
        return ResponseEntity.ok().build();
    }
}
