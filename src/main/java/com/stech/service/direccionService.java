package com.stech.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.stech.model.directions;
import com.stech.repository.directionRepository;

@Service
public class direccionService {
    // Repositorio de direcciones que se inyectara en el constructor
    private final directionRepository directionRepository;

    //constructor de la clase que recibe un repositorio de direcciones 
    public direccionService(directionRepository directionRepository) {
        this.directionRepository = directionRepository;
    }
    // metodo para obtener todas las direcciones este sera llamado desde el controlador
    public List<directions> getAllDirections() {
        return directionRepository.findAll();
    }



}
