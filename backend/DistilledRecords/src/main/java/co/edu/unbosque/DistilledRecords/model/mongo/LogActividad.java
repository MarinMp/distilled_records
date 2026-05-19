package co.edu.unbosque.DistilledRecords.model.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Map;

@Document(collection = "logs_actividad")
public class LogActividad {
    @Id
    private String id;
    private Date timestamp;
    private Map<String, Object> usuario;
    private Map<String, Object> accion;
    private Map<String, Object> contexto;
    private String resultado;
    private int duracion_ms;

    public LogActividad() {
    }

    public String getId() {
        return id;
    }

    public void setId(String v) {
        this.id = v;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date v) {
        this.timestamp = v;
    }

    public Map<String, Object> getUsuario() {
        return usuario;
    }

    public void setUsuario(Map<String, Object> v) {
        this.usuario = v;
    }

    public Map<String, Object> getAccion() {
        return accion;
    }

    public void setAccion(Map<String, Object> v) {
        this.accion = v;
    }

    public Map<String, Object> getContexto() {
        return contexto;
    }

    public void setContexto(Map<String, Object> v) {
        this.contexto = v;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String v) {
        this.resultado = v;
    }

    public int getDuracion_ms() {
        return duracion_ms;
    }

    public void setDuracion_ms(int v) {
        this.duracion_ms = v;
    }
}
