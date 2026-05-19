package co.edu.unbosque.distilledrecordsfront.view;

import co.edu.unbosque.distilledrecordsfront.model.DetalleVentaDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceDetalleVenta;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("detalleVentaBean")
@ViewScoped
public class DetalleVentaBean implements Serializable {

    private DetalleVentaDTO detalleVentaDto;

    @Inject
    private InterfaceDetalleVenta detalleVentaService;

    @PostConstruct
    public void init(){
        detalleVentaDto = new DetalleVentaDTO();
    }

    public void registrarDetalleVenta() throws JsonProcessingException {
        detalleVentaService.registrar(detalleVentaDto);
        detalleVentaDto = new DetalleVentaDTO();
    }

    public List<DetalleVentaDTO> listarDetalleVentas() throws JsonProcessingException {
        return detalleVentaService.listar();
    }

    public DetalleVentaDTO getDetalleVentaDto() {
        return detalleVentaDto;
    }

    public void setDetalleVentaDto(DetalleVentaDTO detalleVentaDto) {
        this.detalleVentaDto = detalleVentaDto;
    }
}
