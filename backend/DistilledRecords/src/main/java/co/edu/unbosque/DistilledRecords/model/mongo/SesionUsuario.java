package co.edu.unbosque.DistilledRecords.model.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document(collection = "sesiones_usuario")
public class SesionUsuario {
    @Id
    private String id;
    private String id_empleado_mysql;
    private String username;
    private String token;
    private Date creado_en;
    private Date expira_en;
    private String ip_origen;
    private boolean activa;
    private Date ultimo_acceso;
    private List<String> modulos_visitados;

    public SesionUsuario() {
    }

    public String getId() {
        return id;
    }

    public void setId(String v) {
        this.id = v;
    }

    public String getId_empleado_mysql() {
        return id_empleado_mysql;
    }

    public void setId_empleado_mysql(String v) {
        this.id_empleado_mysql = v;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String v) {
        this.username = v;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String v) {
        this.token = v;
    }

    public Date getCreado_en() {
        return creado_en;
    }

    public void setCreado_en(Date v) {
        this.creado_en = v;
    }

    public Date getExpira_en() {
        return expira_en;
    }

    public void setExpira_en(Date v) {
        this.expira_en = v;
    }

    public String getIp_origen() {
        return ip_origen;
    }

    public void setIp_origen(String v) {
        this.ip_origen = v;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean v) {
        this.activa = v;
    }

    public Date getUltimo_acceso() {
        return ultimo_acceso;
    }

    public void setUltimo_acceso(Date v) {
        this.ultimo_acceso = v;
    }

    public List<String> getModulos_visitados() {
        return modulos_visitados;
    }

    public void setModulos_visitados(List<String> v) {
        this.modulos_visitados = v;
    }
}
