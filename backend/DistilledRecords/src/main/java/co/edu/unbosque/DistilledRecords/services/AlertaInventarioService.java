package co.edu.unbosque.DistilledRecords.services;

import co.edu.unbosque.DistilledRecords.model.mongo.AlertaInventario;
import co.edu.unbosque.DistilledRecords.repository.mongo.AlertaInventarioRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AlertaInventarioService {
    private final AlertaInventarioRepository repo;

    public AlertaInventarioService(AlertaInventarioRepository r) {
        this.repo = r;
    }

    public AlertaInventario crear(AlertaInventario a) {
        a.setFecha_alerta(new Date());
        a.setEstado("PENDIENTE");
        return repo.save(a);
    }

    public List<AlertaInventario> obtenerPendientes() {
        return repo.findByEstado("PENDIENTE");
    }

    public List<AlertaInventario> obtenerTodas() {
        return repo.findAll();
    }

    public AlertaInventario atender(String id, String empleado) {
        AlertaInventario a = repo.findById(id).orElseThrow(() -> new RuntimeException("Alerta no encontrada"));
        a.setEstado("ATENDIDA");
        a.setAtendida_por(empleado);
        return repo.save(a);
    }

    public void eliminar(String id) {
        repo.deleteById(id);
    }
}
