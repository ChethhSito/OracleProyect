package com.stech.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stech.model.directions;
import com.stech.service.direccionService;

@RestController
@RequestMapping("/api/directions")
public class directionController {
    
    private final direccionService direccionService;

    // constructor de la clase que recibe un servicio de direcciones  
    public directionController(direccionService directionService) {
        this.direccionService = directionService;
    }

    @GetMapping
    public List<directions> getAllDirections() {
        System.out.println("Fetching all directions");
        //hace la conversion de la lista de direcciones a JSON 
        return direccionService.getAllDirections();
    }
}   
