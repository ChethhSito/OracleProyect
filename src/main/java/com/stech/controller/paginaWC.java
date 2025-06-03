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
    
}
