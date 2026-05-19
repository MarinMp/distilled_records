package co.edu.unbosque.DistilledRecords.model.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "proveedor")
public class Proveedor implements Serializable {

    @Id
    @Column(name = "ID_PROVEEDOR")
    private String idProveedor;

    @ManyToOne
    @JoinColumn(name = "ID_USUARIO")
    private Usuario usuario;

    @Column(name = "CORREO")
    private String correo;

    @Column(name = "DIRECCION")
    private String direccion;

    @ManyToOne
    @JoinColumn(name = "ID_CIUDAD")
    private Ciudad ciudad;

    public Proveedor() {
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
