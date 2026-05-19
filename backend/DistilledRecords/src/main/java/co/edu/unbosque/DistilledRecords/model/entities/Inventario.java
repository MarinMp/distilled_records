package co.edu.unbosque.DistilledRecords.model.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "inventario")
public class Inventario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_INVENTARIO")
    private Integer idInventario;

    @Column(name = "CANTIDAD_DISPONIBLE")
    private Integer cantidadDisponible;

    public Inventario() {
    }

    public Integer getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Integer idInventario) {
        this.idInventario = idInventario;
    }

    public Integer getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
}
