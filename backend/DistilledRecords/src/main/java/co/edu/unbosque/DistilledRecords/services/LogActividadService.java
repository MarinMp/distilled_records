package co.edu.unbosque.DistilledRecords.services;

import co.edu.unbosque.DistilledRecords.model.mongo.LogActividad;
import co.edu.unbosque.DistilledRecords.repository.mongo.LogActividadRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LogActividadService {
    private final LogActividadRepository repo;

    public LogActividadService(LogActividadRepository r) {
        this.repo = r;
    }

    public LogActividad guardar(LogActividad log) {
        log.setTimestamp(new Date());
        return repo.save(log);
    }

    public List<LogActividad> obtenerTodos() {
        return repo.findAll();
    }

    public List<LogActividad> obtenerPorResultado(String resultado) {
        return repo.findByResultado(resultado);
    }
}
