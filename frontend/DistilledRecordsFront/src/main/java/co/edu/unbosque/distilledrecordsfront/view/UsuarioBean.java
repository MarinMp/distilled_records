package co.edu.unbosque.distilledrecordsfront.view;

import co.edu.unbosque.distilledrecordsfront.model.UsuarioDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceUsuario;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Named("usuarioBean")
@ViewScoped
public class UsuarioBean implements Serializable {

    private UsuarioDTO usuarioDto;

    @Inject
    private InterfaceUsuario usuarioService;

    @PostConstruct
    public void init(){
        usuarioDto = new UsuarioDTO();
    }

    public void registrarUsuario() throws JsonProcessingException {
        UUID uuid = UUID.randomUUID();
        usuarioDto.setIdUsuario(uuid.toString());
        usuarioService.registrar(usuarioDto);
        usuarioDto = new UsuarioDTO();
    }

    public List<UsuarioDTO> listarUsuarios() throws JsonProcessingException {
        return usuarioService.listar();
    }

    public UsuarioDTO getUsuarioDto() {
        return usuarioDto;
    }

    public void setUsuarioDto(UsuarioDTO usuarioDto) {
        this.usuarioDto = usuarioDto;
    }
}

