package co.edu.unbosque.DistilledRecords.services;

import co.edu.unbosque.DistilledRecords.model.dtos.UsuarioDTO;
import co.edu.unbosque.DistilledRecords.model.entities.Usuario;
import co.edu.unbosque.DistilledRecords.repositories.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private ModelMapper modelMapper = new ModelMapper();

    public UsuarioService(UsuarioRepository repository) {
        this.usuarioRepository = repository;
    }

    public List<UsuarioDTO> buscarUsuarios(){
        List<UsuarioDTO> listaUsuarios = new ArrayList<>();
        List<Usuario> usuariosBD = usuarioRepository.findAll();
        for (Usuario usuario : usuariosBD) {
            listaUsuarios.add(modelMapper.map(usuario, UsuarioDTO.class));
        }
        return listaUsuarios;
    }

    public UsuarioDTO registrarUsuario(UsuarioDTO usuario) {
        return modelMapper.map(
                usuarioRepository.save(modelMapper.map(usuario, Usuario.class)),
                UsuarioDTO.class
        );
    }
}