package co.edu.unbosque.DistilledRecords.model.dtos;

public class ProductoDTO {

    private Integer idProducto;
    private String marca;
    private Integer precio;
    private Integer gradoAlcohol;
    private ProveedorDTO proveedor;
    private CategoriaDTO categoria;
    private InventarioDTO inventario;

    public ProductoDTO() {
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(Integer gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }

    public ProveedorDTO getProveedor() {
        return proveedor;
    }

    public void setProveedor(ProveedorDTO proveedor) {
        this.proveedor = proveedor;
    }

    public CategoriaDTO getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDTO categoria) {
        this.categoria = categoria;
    }

    public InventarioDTO getInventario() {
        return inventario;
    }

    public void setInventario(InventarioDTO inventario) {
        this.inventario = inventario;
    }
}
