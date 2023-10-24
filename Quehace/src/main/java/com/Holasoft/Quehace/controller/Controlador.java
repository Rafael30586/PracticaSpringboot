package com.Holasoft.Quehace.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controlador {

    @GetMapping("/saludo")
    public String saludar(){
        return "Hola mundo";
    }

    @GetMapping("/saludoOtraVez") //Ejemplo http://localhost:8080/saludoOtraVez?numerito=3
    public String saludarotraVez(@RequestParam int numerito){
        return "Sos un "+numerito;
    }
}
