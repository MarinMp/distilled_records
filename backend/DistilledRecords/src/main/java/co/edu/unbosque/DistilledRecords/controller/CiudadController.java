package co.edu.unbosque.DistilledRecords.controller;

import co.edu.unbosque.DistilledRecords.model.dtos.CiudadDTO;
import co.edu.unbosque.DistilledRecords.services.CiudadService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/licorera/api")
public class CiudadController {

    private final CiudadService ciudadService;

    public CiudadController(CiudadService ciudadService) {
        this.ciudadService = ciudadService;
    }

    @GetMapping("/ciudades")
    public ResponseEntity<List<CiudadDTO>> listarCiudades() {
        System.out.println("Lista de ciudades");
        return new ResponseEntity<>(ciudadService.buscarCiudades(), HttpStatus.OK);
    }

    @PostMapping("/ciudades")
    public ResponseEntity<CiudadDTO> registrarCiudad(@RequestBody CiudadDTO ciudad) {
        System.out.println("Ciudad registrada");
        return new ResponseEntity<>(ciudadService.registrarCiudad(ciudad), HttpStatus.CREATED);
    }
}

