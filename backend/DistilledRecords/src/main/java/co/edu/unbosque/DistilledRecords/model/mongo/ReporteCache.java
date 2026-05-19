package co.edu.unbosque.DistilledRecords.model.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Map;

@Document(collection = "reportes_cache")
public class ReporteCache {
    @Id
    private String id;
    private String tipo_reporte;
    private Map<String, Object> parametros;
    private String generado_por;
    private Date generado_en;
    private Date expira_en;
    private Map<String, Object> resultado;

    public ReporteCache() {
    }

    public String getId() {
        return id;
    }

    public void setId(String v) {
        this.id = v;
    }

    public String getTipo_reporte() {
        return tipo_reporte;
    }

    public void setTipo_reporte(String v) {
        this.tipo_reporte = v;
    }

    public Map<String, Object> getParametros() {
        return parametros;
    }

    public void setParametros(Map<String, Object> v) {
        this.parametros = v;
    }

    public String getGenerado_por() {
        return generado_por;
    }

    public void setGenerado_por(String v) {
        this.generado_por = v;
    }

    public Date getGenerado_en() {
        return generado_en;
    }

    public void setGenerado_en(Date v) {
        this.generado_en = v;
    }

    public Date getExpira_en() {
        return expira_en;
    }

    public void setExpira_en(Date v) {
        this.expira_en = v;
    }

    public Map<String, Object> getResultado() {
        return resultado;
    }

    public void setResultado(Map<String, Object> v) {
        this.resultado = v;
    }
}
