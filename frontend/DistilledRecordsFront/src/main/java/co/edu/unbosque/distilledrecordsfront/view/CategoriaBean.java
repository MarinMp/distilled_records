package co.edu.unbosque.distilledrecordsfront.view;

import co.edu.unbosque.distilledrecordsfront.model.CategoriaDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceCategoria;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("categoriaBean")
@ViewScoped
public class CategoriaBean implements Serializable {

    private CategoriaDTO categoriaDto;

    @Inject
    private InterfaceCategoria categoriaService;

    @PostConstruct
    public void init(){
        categoriaDto = new CategoriaDTO();
    }

    public void registrarCategoria() throws JsonProcessingException {
        categoriaService.registrar(categoriaDto);
        categoriaDto = new CategoriaDTO();
    }

    public List<CategoriaDTO> listarCategorias() throws JsonProcessingException {
        return categoriaService.listar();
    }

    public CategoriaDTO getCategoriaDto() {
        return categoriaDto;
    }

    public void setCategoriaDto(CategoriaDTO categoriaDto) {
        this.categoriaDto = categoriaDto;
    }
}
