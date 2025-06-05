package com.stech.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.stech.model.clients;
import com.stech.model.directions;
import com.stech.repository.clientRepository;
import com.stech.repository.directionRepository;

@Service
public class direccionService {
    // Repositorio de direcciones que se inyectara en el constructor
    
    private final directionRepository directionRepository;
    
    // Repositorio de clientes que se inyectara en el constructor
    private final  clientRepository clientsRepository; // Asegúrate de tener este repositorio

    //constructor de la clase que recibe un repositorio de direcciones 
    public direccionService(directionRepository directionRepository, clientRepository clientsRepository) {
        this.directionRepository = directionRepository;
        this.clientsRepository = clientsRepository; // Inicializa el repositorio de clientes
    }
    // metodo para obtener todas las direcciones este sera llamado desde el controlador
    public List<directions> getAllDirections() {
        return directionRepository.findAll();
    }
     public directions getDirectionById(Long id) {
        return directionRepository.findById(id).orElse(null);
    }
    public directions saveDirection(directions direction) {
        Long clienteId = direction.getClienteId().getId();
        clients cliente = clientsRepository.findById(clienteId).orElseThrow(() -> new RuntimeException("Cliente no encontrado con id: " + clienteId));
        direction.setClienteId(cliente);
        return directionRepository.save(direction);
    }
    public directions updateDirection(Long id, directions directionDa){
        try{
        if(directionRepository.existsById(id)) {
            directionDa.setId(id);
            return directionRepository.save(directionDa);
        }}catch (Exception e) {
            throw new RuntimeException("Error updating direction with id: " + id, e);
        }
        return null;
    }
    public directions deleteDirection(Long id){
        try{
        if(directionRepository.existsById(id)){
            directions direction = directionRepository.findById(id).orElse(null);
            directionRepository.deleteById(id);
            return direction;
        }}catch (Exception e) {
            throw new RuntimeException("Error deleting direction with id: " + id, e);
        }
        return null;
    }


}
