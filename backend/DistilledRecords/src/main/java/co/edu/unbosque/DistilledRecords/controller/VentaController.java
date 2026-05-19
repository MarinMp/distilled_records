package co.edu.unbosque.DistilledRecords.controller;

import co.edu.unbosque.DistilledRecords.model.dtos.ResponseDTO;
import co.edu.unbosque.DistilledRecords.model.dtos.VentaDTO;
import co.edu.unbosque.DistilledRecords.services.VentaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/licorera/api")
public class VentaController {

    private final VentaService ventaService;

    public VentaController(VentaService ventaService) {
        this.ventaService = ventaService;
    }

    @GetMapping("/ventas")
    public ResponseEntity<List<VentaDTO>> listarVentas() {
        System.out.println("Lista de ventas");
        return new ResponseEntity<>(ventaService.buscarVentas(), HttpStatus.OK);
    }

    @PostMapping("/ventas")
    public ResponseEntity<VentaDTO> registrarVenta(@RequestBody VentaDTO venta) {
        System.out.println("Venta registrada");
        return new ResponseEntity<>(ventaService.registrarVenta(venta), HttpStatus.CREATED);
    }


    @PostMapping("ventas/registrar")
    public ResponseEntity<ResponseDTO> registrarVenta(
            @RequestParam String cliente,
            @RequestParam String empleado,
            @RequestParam Integer producto,
            @RequestParam Integer cantidad) {

        ResponseDTO response = ventaService.registrarVenta(
                cliente, empleado, producto, cantidad
        );

        if (response.isSuccess()) {
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
}

