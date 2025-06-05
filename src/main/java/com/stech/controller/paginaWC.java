package com.stech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class paginaWC {
    @GetMapping("/clientes")
    public String PageClients() {
        return "paginas/clientes";
    }
    @GetMapping("/direcciones")
    public String PageAddresses() {
        return "paginas/direcciones";
    }
    @GetMapping("/bienvenida")
    public String PageWelcome() {
        return "paginas/bienvenida";
    }
    @GetMapping("/agregarCliente")
    public String AddCliente() {
        return "formularios/agregarCliente";
    }
    @GetMapping("/agregarDireccion")
    public String AddDireccion() {
        return "formularios/agregarDireccion";
    }
    @GetMapping("/editarCliente")
    public String EditCliente() {
        return "formularios/editarCliente";
    }
    @GetMapping("/editarDireccion")
    public String EditDireccion() {
        return "formularios/editarDireccion";
    }
    
    
    
}
