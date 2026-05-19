package co.edu.unbosque.DistilledRecords.repository.mongo;
import co.edu.unbosque.DistilledRecords.model.mongo.LogActividad;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface LogActividadRepository extends MongoRepository<LogActividad,String>{
    List<LogActividad> findByResultado(String resultado);
}
