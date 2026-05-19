package co.edu.unbosque.DistilledRecords.repositories;

import co.edu.unbosque.DistilledRecords.model.entities.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends JpaRepository<Venta, Integer> {
}
