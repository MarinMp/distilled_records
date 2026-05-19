package co.edu.unbosque.DistilledRecords.controller;

import co.edu.unbosque.DistilledRecords.model.dtos.EmpleadoDTO;
import co.edu.unbosque.DistilledRecords.services.EmpleadoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/licorera/api")
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @GetMapping("/empleados")
    public ResponseEntity<List<EmpleadoDTO>> listarEmpleados() {
        System.out.println("Lista de empleados");
        return new ResponseEntity<>(empleadoService.buscarEmpleados(), HttpStatus.OK);
    }

    @PostMapping("/empleados")
    public ResponseEntity<EmpleadoDTO> registrarEmpleado(@RequestBody EmpleadoDTO empleado) {
        System.out.println("Empleado registrado");
        return new ResponseEntity<>(empleadoService.registrarEmpleado(empleado), HttpStatus.CREATED);
    }
}
