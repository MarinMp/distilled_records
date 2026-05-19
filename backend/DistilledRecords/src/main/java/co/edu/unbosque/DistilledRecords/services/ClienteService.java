package co.edu.unbosque.DistilledRecords.services;

import co.edu.unbosque.DistilledRecords.model.dtos.ClienteDTO;
import co.edu.unbosque.DistilledRecords.model.entities.Cliente;
import co.edu.unbosque.DistilledRecords.repositories.ClienteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private ModelMapper modelMapper = new ModelMapper();

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteDTO> buscarClientes(){
        List<ClienteDTO> listaClientes = new ArrayList<>();
        List<Cliente> clientesBD = clienteRepository.findAll();
        for (Cliente cliente : clientesBD) {
            listaClientes.add(modelMapper.map(cliente, ClienteDTO.class));
        }
        return listaClientes;
    }

    public ClienteDTO registrarCliente(ClienteDTO cliente) {
        return modelMapper.map(
                clienteRepository.save(modelMapper.map(cliente, Cliente.class)),
                ClienteDTO.class
        );
    }
}
