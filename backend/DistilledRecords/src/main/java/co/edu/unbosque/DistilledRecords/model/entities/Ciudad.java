package co.edu.unbosque.DistilledRecords.model.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "ciudad")
public class Ciudad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CIUDAD")
    private Integer idCiudad;

    @Column(name = "NOMBRE")
    private String nombre;

    public Ciudad() {
    }

    public Integer getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Integer idCiudad) {
        this.idCiudad = idCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}