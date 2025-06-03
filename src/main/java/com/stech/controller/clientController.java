package com.stech.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stech.model.clients;
import com.stech.service.clienteService;

@RestController
@RequestMapping("/api/clients")
public class clientController {

    private final clienteService clienteService;

    // Constructor de la clase que recibe un servicio de clientes
    public clientController(clienteService clienteService) {
        this.clienteService = clienteService;
    }

    // Método para obtener todos los clientes, este será llamado desde el controlador
    @GetMapping
    public List<clients> getAllClients() {
        
        System.out.println("Fetching all clients");
        return clienteService.getAllClients();
    }

}
