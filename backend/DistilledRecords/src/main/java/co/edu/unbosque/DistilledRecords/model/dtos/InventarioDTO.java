package co.edu.unbosque.DistilledRecords.model.dtos;

public class InventarioDTO {

    private Integer idInventario;
    private Integer cantidadDisponible;

    public InventarioDTO() {
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