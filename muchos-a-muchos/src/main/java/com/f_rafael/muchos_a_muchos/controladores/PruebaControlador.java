package com.f_rafael.muchos_a_muchos.controladores;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/prueba")
public class PruebaControlador {

    @GetMapping("/saludo")
    public String saludar(){
        return "Probando...probando...";
    }

    @GetMapping("/respuesta-exitosa")
    public ResponseEntity<String> responder(){
        return ResponseEntity.ok("Respuesta exitosa");
    }

    @GetMapping("/paises")
    public ResponseEntity<List<String>> mostrarPaises(){
        List<String> paises = List.of("Argentina","Hungria","Corea del sur","Bielorusia");
        return ResponseEntity.ok(paises);
    }
}
