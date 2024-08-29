package com.f_rafael.muchos_a_muchos.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class PruebaControlador {

    @GetMapping("/saludo")
    public String saludar(){
        return "Probando...probando...";
    }
}
