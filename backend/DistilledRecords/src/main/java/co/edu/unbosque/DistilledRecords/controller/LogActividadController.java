package co.edu.unbosque.DistilledRecords.controller;

import co.edu.unbosque.DistilledRecords.model.mongo.LogActividad;
import co.edu.unbosque.DistilledRecords.services.LogActividadService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/licorera/api/mongo")
public class LogActividadController {
    private final LogActividadService service;

    public LogActividadController(LogActividadService s) {
        this.service = s;
    }

    @GetMapping("/logs")
    public ResponseEntity<List<LogActividad>> listar() {
        return new ResponseEntity<>(service.obtenerTodos(), HttpStatus.OK);
    }

    @GetMapping("/logs/resultado/{resultado}")
    public ResponseEntity<List<LogActividad>> porResultado(@PathVariable String resultado) {
        return new ResponseEntity<>(service.obtenerPorResultado(resultado), HttpStatus.OK);
    }

    @PostMapping("/logs")
    public ResponseEntity<LogActividad> crear(@RequestBody LogActividad log) {
        return new ResponseEntity<>(service.guardar(log), HttpStatus.CREATED);
    }
}
