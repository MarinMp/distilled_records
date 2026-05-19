package co.edu.unbosque.DistilledRecords.controller;

import co.edu.unbosque.DistilledRecords.model.mongo.ReporteCache;
import co.edu.unbosque.DistilledRecords.services.ReporteCacheService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/licorera/api/mongo")
public class ReporteCacheController {
    private final ReporteCacheService service;

    public ReporteCacheController(ReporteCacheService s) {
        this.service = s;
    }

    @GetMapping("/reportes")
    public ResponseEntity<List<ReporteCache>> listar() {
        return new ResponseEntity<>(service.obtenerTodos(), HttpStatus.OK);
    }

    @GetMapping("/reportes/{tipo}")
    public ResponseEntity<?> buscar(@PathVariable String tipo) {
        return service.buscarPorTipo(tipo).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/reportes")
    public ResponseEntity<ReporteCache> guardar(@RequestBody ReporteCache r) {
        return new ResponseEntity<>(service.guardar(r), HttpStatus.CREATED);
    }

    @DeleteMapping("/reportes/expirados")
    public ResponseEntity<Void> limpiar() {
        service.limpiarExpirados();
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/reportes/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable String id) {
        service.eliminar(id);
        return ResponseEntity.ok().build();
    }
}
