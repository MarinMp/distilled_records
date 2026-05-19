package co.edu.unbosque.DistilledRecords.repository.mongo;
import co.edu.unbosque.DistilledRecords.model.mongo.ReporteCache;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.Date; import java.util.Optional;
@Repository
public interface ReporteCacheRepository extends MongoRepository<ReporteCache,String>{
    Optional<ReporteCache> findByTipoReporte(String tipoReporte);
    void deleteByExpiraEnBefore(Date fecha);
}
