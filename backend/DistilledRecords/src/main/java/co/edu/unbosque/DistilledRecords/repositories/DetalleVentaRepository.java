package co.edu.unbosque.DistilledRecords.repositories;

import co.edu.unbosque.DistilledRecords.model.entities.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleVentaRepository extends JpaRepository<DetalleVenta, Integer> {
}
