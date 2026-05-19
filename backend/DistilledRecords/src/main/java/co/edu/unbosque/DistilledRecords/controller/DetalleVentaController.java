package co.edu.unbosque.DistilledRecords.controller;

import co.edu.unbosque.DistilledRecords.model.dtos.DetalleVentaDTO;
import co.edu.unbosque.DistilledRecords.services.DetalleVentaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/licorera/api")
public class DetalleVentaController {

    private final DetalleVentaService detalleVentaService;

    public DetalleVentaController(DetalleVentaService detalleVentaService) {
        this.detalleVentaService = detalleVentaService;
    }

    @GetMapping("/detalle-ventas")
    public ResponseEntity<List<DetalleVentaDTO>> listarDetalleVentas() {
        System.out.println("Lista de detalle de ventas");
        return new ResponseEntity<>(detalleVentaService.buscarDetalleVentas(), HttpStatus.OK);
    }

    @PostMapping("/detalle-ventas")
    public ResponseEntity<DetalleVentaDTO> registrarDetalleVenta(@RequestBody DetalleVentaDTO detalleVenta) {
        System.out.println("Detalle de venta registrado");
        return new ResponseEntity<>(detalleVentaService.registrarDetalleVenta(detalleVenta), HttpStatus.CREATED);
    }
}
