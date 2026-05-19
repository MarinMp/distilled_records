package co.edu.unbosque.distilledrecordsfront.view;

import co.edu.unbosque.distilledrecordsfront.model.ClienteDTO;
import co.edu.unbosque.distilledrecordsfront.services.interfaces.InterfaceCliente;
import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("clienteBean")
@ViewScoped
public class ClienteBean implements Serializable {

    private ClienteDTO clienteDto;

    @Inject
    private InterfaceCliente clienteService;

    @PostConstruct
    public void init(){
        clienteDto = new ClienteDTO();
    }

    public void registrarCliente() throws JsonProcessingException {
        clienteService.registrar(clienteDto);
        clienteDto = new ClienteDTO();
    }

    public List<ClienteDTO> listarClientes() throws JsonProcessingException {
        return clienteService.listar();
    }

    public ClienteDTO getClienteDto() {
        return clienteDto;
    }

    public void setClienteDto(ClienteDTO clienteDto) {
        this.clienteDto = clienteDto;
    }
}

