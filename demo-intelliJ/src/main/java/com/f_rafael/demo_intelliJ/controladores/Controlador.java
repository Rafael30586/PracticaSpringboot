package com.f_rafael.demo_intelliJ.controladores;

import com.f_rafael.demo_intelliJ.entidades.VideoJuego;
import com.f_rafael.demo_intelliJ.servicios.VideoJuegoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/")
public class Controlador {

    @Autowired
    private VideoJuegoServicio videoJuegoServicio;

    @GetMapping("/saludo")
    public String saludar(){
        return "probando...probando...";
    }

    @GetMapping("/todos")
    public List<VideoJuego> mostrarVideoJuegos(){
        return videoJuegoServicio.devolverVideoJuegos();
    }

    @PostMapping("/guardar")
    public void guardarVideoJuego(@RequestBody VideoJuego videoJuego){
        videoJuegoServicio.guardarVideoJuego(videoJuego);
    }

    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }
}
