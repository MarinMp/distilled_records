package co.edu.unbosque.distilledrecordsfront.services;

import co.edu.unbosque.distilledrecordsfront.model.UsuarioDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceUsuario;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class UsuarioService implements InterfaceUsuario {

    private ApiService apiService;

    public UsuarioService() {
        apiService = new ApiService();
    }

    @Override
    public UsuarioDTO registrar(UsuarioDTO usuario) throws JsonProcessingException {
        return apiService.registrar("usuarios", usuario, UsuarioDTO.class);
    }

    @Override
    public List<UsuarioDTO> listar() throws JsonProcessingException {
        return apiService.listar("usuarios", UsuarioDTO.class);
    }
}
