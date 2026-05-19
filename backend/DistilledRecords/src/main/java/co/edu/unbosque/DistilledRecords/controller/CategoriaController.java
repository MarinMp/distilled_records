package co.edu.unbosque.DistilledRecords.controller;

import co.edu.unbosque.DistilledRecords.model.dtos.CategoriaDTO;
import co.edu.unbosque.DistilledRecords.services.CategoriaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/licorera/api")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @GetMapping("/categorias")
    public ResponseEntity<List<CategoriaDTO>> listarCategorias() {
        System.out.println("Lista de categorias");
        return new ResponseEntity<>(categoriaService.buscarCategorias(), HttpStatus.OK);
    }

    @PostMapping("/categorias")
    public ResponseEntity<CategoriaDTO> registrarCategoria(@RequestBody CategoriaDTO categoria) {
        System.out.println("Categoria registrada");
        return new ResponseEntity<>(categoriaService.registrarCateoria(categoria), HttpStatus.CREATED);
    }
}
