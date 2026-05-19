package co.edu.unbosque.DistilledRecords.repositories;

import co.edu.unbosque.DistilledRecords.model.entities.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedorRepository extends JpaRepository<Proveedor, String> {
}
