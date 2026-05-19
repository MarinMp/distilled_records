package co.edu.unbosque.DistilledRecords.controller;

import co.edu.unbosque.DistilledRecords.model.dtos.UsuarioDTO;
import co.edu.unbosque.DistilledRecords.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/licorera/api")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/usuarios")
    public ResponseEntity<List<UsuarioDTO>> listarUsuarios() {
        System.out.println("Lista de usuarios");
        return new ResponseEntity<>(usuarioService.buscarUsuarios(), HttpStatus.OK);
    }

    @PostMapping("/usuarios")
    public ResponseEntity<UsuarioDTO> registrarUsuario(@RequestBody UsuarioDTO usuario) {
        System.out.println("Usuario registrado");
        return new ResponseEntity<>(usuarioService.registrarUsuario(usuario), HttpStatus.CREATED);
    }
}