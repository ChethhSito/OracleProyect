package com.stech.controller;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @GetMapping("/get/{id}")
    public clients getClientId(@PathVariable Long id) {
        return clienteService.getClientById(id);
    }
    @PostMapping("/add")
    public clients nuevoClient(@RequestBody clients client) {
        return clienteService.saveClient(client);
    }
    @PutMapping("/update/{id}")
    public clients actualizarClient(@PathVariable Long id,@RequestBody clients datos) {
        return clienteService.updateClient(id, datos);
    }
    @DeleteMapping("/delete/{id}")
    public clients eliminarClient(@PathVariable Long id) {
        return clienteService.deleteClient(id);
    }

}
