package co.edu.unbosque.DistilledRecords.services;

import co.edu.unbosque.DistilledRecords.model.dtos.EmpleadoDTO;
import co.edu.unbosque.DistilledRecords.model.entities.Empleado;
import co.edu.unbosque.DistilledRecords.repositories.EmpleadoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService {

    private final EmpleadoRepository empleadoRepository;
    private ModelMapper modelMapper = new ModelMapper();

    public EmpleadoService(EmpleadoRepository repository) {
        this.empleadoRepository = repository;
    }

    public List<EmpleadoDTO> buscarEmpleados(){
        List<EmpleadoDTO> listaEmpleados = new ArrayList<>();
        List<Empleado> empleadosBD = empleadoRepository.findAll();
        for (Empleado empleado : empleadosBD) {
            listaEmpleados.add(modelMapper.map(empleado, EmpleadoDTO.class));
        }
        return listaEmpleados;
    }

    public EmpleadoDTO registrarEmpleado(EmpleadoDTO empleado) {
        return modelMapper.map(
                empleadoRepository.save(modelMapper.map(empleado, Empleado.class)),
                EmpleadoDTO.class
        );
    }
}

