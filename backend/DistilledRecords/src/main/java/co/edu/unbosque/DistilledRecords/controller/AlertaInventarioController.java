package co.edu.unbosque.DistilledRecords.controller;

import co.edu.unbosque.DistilledRecords.model.mongo.AlertaInventario;
import co.edu.unbosque.DistilledRecords.services.AlertaInventarioService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/licorera/api/mongo")
public class AlertaInventarioController {
    private final AlertaInventarioService service;

    public AlertaInventarioController(AlertaInventarioService s) {
        this.service = s;
    }

    @GetMapping("/alertas")
    public ResponseEntity<List<AlertaInventario>> listar() {
        return new ResponseEntity<>(service.obtenerTodas(), HttpStatus.OK);
    }

    @GetMapping("/alertas/pendientes")
    public ResponseEntity<List<AlertaInventario>> pendientes() {
        return new ResponseEntity<>(service.obtenerPendientes(), HttpStatus.OK);
    }

    @PostMapping("/alertas")
    public ResponseEntity<AlertaInventario> crear(@RequestBody AlertaInventario a) {
        return new ResponseEntity<>(service.crear(a), HttpStatus.CREATED);
    }

    @PutMapping("/alertas/{id}/atender")
    public ResponseEntity<AlertaInventario> atender(@PathVariable String id, @RequestParam String empleado) {
        return new ResponseEntity<>(service.atender(id, empleado), HttpStatus.OK);
    }

    @DeleteMapping("/alertas/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable String id) {
        service.eliminar(id);
        return ResponseEntity.ok().build();
    }
}
