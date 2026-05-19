package co.edu.unbosque.DistilledRecords.services;

import co.edu.unbosque.DistilledRecords.model.mongo.SesionUsuario;
import co.edu.unbosque.DistilledRecords.repository.mongo.SesionUsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class SesionUsuarioService {
    private final SesionUsuarioRepository repo;

    public SesionUsuarioService(SesionUsuarioRepository r) {
        this.repo = r;
    }

    public SesionUsuario crear(SesionUsuario s) {
        s.setCreado_en(new Date());
        s.setUltimo_acceso(new Date());
        s.setActiva(true);
        return repo.save(s);
    }

    public List<SesionUsuario> obtenerActivas() {
        return repo.findByActivaTrue();
    }

    public Optional<SesionUsuario> buscarPorToken(String token) {
        return repo.findByToken(token);
    }

    public void cerrarSesion(String token) {
        repo.findByToken(token).ifPresent(s -> {
            s.setActiva(false);
            repo.save(s);
        });
    }

    public List<SesionUsuario> obtenerTodas() {
        return repo.findAll();
    }
}
