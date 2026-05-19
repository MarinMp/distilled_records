package co.edu.unbosque.DistilledRecords.model.dtos;

public class CiudadDTO {

    private Integer idCiudad;
    private String nombre;

    public CiudadDTO() {
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
