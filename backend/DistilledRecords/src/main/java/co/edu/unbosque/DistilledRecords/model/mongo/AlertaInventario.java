package co.edu.unbosque.DistilledRecords.model.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Map;

@Document(collection = "alertas_inventario")
public class AlertaInventario {

    @Id
    private String id;
    private int id_producto_mysql;
    private String nombre_producto;
    private String tipo_alerta;
    private int stock_actual;
    private int stock_minimo;
    private int unidades_faltantes;
    private Map<String, Object> proveedor;
    private Date fecha_alerta;
    private String estado;
    private String atendida_por;

    public AlertaInventario() {
    }

    public String getId() {
        return id;
    }

    public void setId(String v) {
        this.id = v;
    }

    public int getId_producto_mysql() {
        return id_producto_mysql;
    }

    public void setId_producto_mysql(int v) {
        this.id_producto_mysql = v;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String v) {
        this.nombre_producto = v;
    }

    public String getTipo_alerta() {
        return tipo_alerta;
    }

    public void setTipo_alerta(String v) {
        this.tipo_alerta = v;
    }

    public int getStock_actual() {
        return stock_actual;
    }

    public void setStock_actual(int v) {
        this.stock_actual = v;
    }

    public int getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(int v) {
        this.stock_minimo = v;
    }

    public int getUnidades_faltantes() {
        return unidades_faltantes;
    }

    public void setUnidades_faltantes(int v) {
        this.unidades_faltantes = v;
    }

    public Map<String, Object> getProveedor() {
        return proveedor;
    }

    public void setProveedor(Map<String, Object> v) {
        this.proveedor = v;
    }

    public Date getFecha_alerta() {
        return fecha_alerta;
    }

    public void setFecha_alerta(Date v) {
        this.fecha_alerta = v;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String v) {
        this.estado = v;
    }

    public String getAtendida_por() {
        return atendida_por;
    }

    public void setAtendida_por(String v) {
        this.atendida_por = v;
    }
}
