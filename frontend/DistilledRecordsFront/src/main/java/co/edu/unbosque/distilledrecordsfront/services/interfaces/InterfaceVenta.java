package co.edu.unbosque.distilledrecordsfront.services.interfaces;

import co.edu.unbosque.distilledrecordsfront.model.ResponseDTO;
import co.edu.unbosque.distilledrecordsfront.model.VentaDTO;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface InterfaceVenta extends InterfaceService<VentaDTO>{

    ResponseDTO registrarVenta(String cliente,
                               String empleado,
                               Integer producto,
                               Integer cantidad) throws JsonProcessingException;
}
