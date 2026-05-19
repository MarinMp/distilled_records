package co.edu.unbosque.DistilledRecords.repositories;

import co.edu.unbosque.DistilledRecords.model.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {
}
