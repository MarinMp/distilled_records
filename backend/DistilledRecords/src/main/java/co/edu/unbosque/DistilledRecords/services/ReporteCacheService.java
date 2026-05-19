package co.edu.unbosque.DistilledRecords.services;

import co.edu.unbosque.DistilledRecords.model.mongo.ReporteCache;
import co.edu.unbosque.DistilledRecords.repository.mongo.ReporteCacheRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReporteCacheService {
    private final ReporteCacheRepository repo;

    public ReporteCacheService(ReporteCacheRepository r) {
        this.repo = r;
    }

    public ReporteCache guardar(ReporteCache r) {
        r.setGenerado_en(new Date());
        r.setExpira_en(new Date(System.currentTimeMillis() + 12 * 60 * 60 * 1000));
        return repo.save(r);
    }

    public Optional<ReporteCache> buscarPorTipo(String tipo) {
        return repo.findByTipoReporte(tipo);
    }

    public List<ReporteCache> obtenerTodos() {
        return repo.findAll();
    }

    public void limpiarExpirados() {
        repo.deleteByExpiraEnBefore(new Date());
    }

    public void eliminar(String id) {
        repo.deleteById(id);
    }
}
