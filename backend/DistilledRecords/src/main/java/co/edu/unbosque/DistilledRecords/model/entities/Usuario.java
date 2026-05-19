package co.edu.unbosque.DistilledRecords.model.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    @Id
    @Column(name = "ID_USUARIO")
    private String idUsuario;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "NUM_TELEFONO")
    private String numTelefono;

    public Usuario() {
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
}
