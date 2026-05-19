package co.edu.unbosque.DistilledRecords.services;

import co.edu.unbosque.DistilledRecords.model.dtos.CategoriaDTO;
import co.edu.unbosque.DistilledRecords.model.entities.Categoria;
import co.edu.unbosque.DistilledRecords.repositories.CategoriaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;
    private ModelMapper modelMapper = new ModelMapper();

    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public List<CategoriaDTO> buscarCategorias(){
        List<CategoriaDTO> listaCategorias = new ArrayList<>();
        List<Categoria> categoriasBD = categoriaRepository.findAll();
        for (Categoria categoria : categoriasBD) {
            listaCategorias.add(modelMapper.map(categoria, CategoriaDTO.class));
        }
        return listaCategorias;
    }

    public CategoriaDTO registrarCateoria(CategoriaDTO categoria) {
        return modelMapper.map(
                categoriaRepository.save(modelMapper.map(categoria, Categoria.class)),
                CategoriaDTO.class);
    }
}
