package co.edu.unbosque.distilledrecordsfront.view;

import co.edu.unbosque.distilledrecordsfront.model.ResponseDTO;
import co.edu.unbosque.distilledrecordsfront.model.VentaDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceVenta;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("ventaBean")
@ViewScoped
public class VentaBean implements Serializable {

    private VentaDTO ventaDto;
    private String cliente;
    private String empleado;
    private Integer producto;
    private Integer cantidad;
    private String mensaje;

    @Inject
    private InterfaceVenta ventaService;

    @PostConstruct
    public void init(){
        ventaDto = new VentaDTO();
    }

    public void registrarVenta() throws JsonProcessingException {
        ventaService.registrar(ventaDto);
        ventaDto = new VentaDTO();
    }

    public List<VentaDTO> listarVentas() throws JsonProcessingException {
        return ventaService.listar();
    }


    public void registrarV() {
        try {
            ResponseDTO response = ventaService.registrarVenta(
                    cliente, empleado, producto, cantidad
            );

            mensaje = response.getMensaje();

        } catch (Exception e) {
            mensaje = "Error en el sistema";
        }
    }

    public VentaDTO getVentaDto() {
        return ventaDto;
    }

    public void setVentaDto(VentaDTO ventaDto) {
        this.ventaDto = ventaDto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public Integer getProducto() {
        return producto;
    }

    public void setProducto(Integer producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}