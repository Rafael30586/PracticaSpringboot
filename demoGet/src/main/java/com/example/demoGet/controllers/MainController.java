package com.example.demoGet.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/miPagina/{palabra}")
    public String mostrarPagina(@PathVariable String palabra){
        return "Hola mundo "+palabra;
    }
}
