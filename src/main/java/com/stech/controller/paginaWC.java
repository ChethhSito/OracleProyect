package com.stech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class paginaWC {
    @GetMapping("/clientes")
    public String PageClients() {
        return "paginas/clientes";
    }
    
}
