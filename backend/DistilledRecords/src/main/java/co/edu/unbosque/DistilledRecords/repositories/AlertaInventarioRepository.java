package co.edu.unbosque.DistilledRecords.repository.mongo;
import co.edu.unbosque.DistilledRecords.model.mongo.AlertaInventario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface AlertaInventarioRepository extends MongoRepository<AlertaInventario,String>{
    List<AlertaInventario> findByEstado(String estado);
    List<AlertaInventario> findByIdProductoMysql(int idProductoMysql);
}
