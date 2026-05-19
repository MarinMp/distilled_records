package co.edu.unbosque.distilledrecordsfront.services;

import co.edu.unbosque.distilledrecordsfront.model.CategoriaDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceCategoria;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class CategoriaService implements InterfaceCategoria {

    private ApiService apiService;

    public CategoriaService() {
        apiService = new ApiService();
    }

    @Override
    public CategoriaDTO registrar(CategoriaDTO categoria) throws JsonProcessingException {
        return apiService.registrar("categorias", categoria, CategoriaDTO.class);
    }

    @Override
    public List<CategoriaDTO> listar() throws JsonProcessingException {
        return apiService.listar("categorias", CategoriaDTO.class);
    }
}
