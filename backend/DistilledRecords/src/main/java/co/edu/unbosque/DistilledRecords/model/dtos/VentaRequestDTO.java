package co.edu.unbosque.DistilledRecords.model.dtos;

import java.time.LocalDate;

public class VentaRequestDTO {
    private String idCliente;
    private String idEmpleado;
    private Integer idProducto;
    private Integer cantidad;
    private LocalDate fecha;

    public VentaRequestDTO() {
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String v) {
        this.idCliente = v;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String v) {
        this.idEmpleado = v;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer v) {
        this.idProducto = v;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer v) {
        this.cantidad = v;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate v) {
        this.fecha = v;
    }
}
