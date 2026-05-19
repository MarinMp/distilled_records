package co.edu.unbosque.DistilledRecords.repository.mongo;
import co.edu.unbosque.DistilledRecords.model.mongo.SesionUsuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List; import java.util.Optional;
@Repository
public interface SesionUsuarioRepository extends MongoRepository<SesionUsuario,String>{
    Optional<SesionUsuario> findByToken(String token);
    List<SesionUsuario> findByActivaTrue();
    List<SesionUsuario> findByIdEmpleadoMysql(String idEmpleadoMysql);
}
