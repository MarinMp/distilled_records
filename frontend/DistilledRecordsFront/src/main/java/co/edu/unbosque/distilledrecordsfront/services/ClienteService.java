package co.edu.unbosque.distilledrecordsfront.services;

import co.edu.unbosque.distilledrecordsfront.model.ClienteDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceCliente;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
public class ClienteService implements InterfaceCliente {

    private ApiService apiService;

    public ClienteService() {
        apiService = new ApiService();
    }

    @Override
    public ClienteDTO registrar(ClienteDTO cliente) throws JsonProcessingException {
        return apiService.registrar("clientes", cliente, ClienteDTO.class);
    }

    @Override
    public List<ClienteDTO> listar() throws JsonProcessingException {
        return apiService.listar("clientes", ClienteDTO.class);
    }
}

