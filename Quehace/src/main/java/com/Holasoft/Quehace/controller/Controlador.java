package com.Holasoft.Quehace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class Controlador {

    @GetMapping("/saludo")
    public String saludar(){
        return "Hola mundo";
    }

    @GetMapping("/saludoOtraVez/{numerito}") //Ejemplo http://localhost:8080/saludoOtraVez?numerito=3
    public String saludarotraVez(@PathVariable int numerito){
        return "Sos un "+numerito;
    }

    //@ResponseBody renderiza el nombre del archivo en lugar de el archivo en si cuando se usa @Controller
    @GetMapping("/Chief")
    public ModelAndView mostrarChief(Model model){
        model.addAttribute("casco","Maestro");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("masterChief.html");

        return modelAndView;
    }

    /*
    @RestController
    public class MyRestController {  ejemplo sacado de stack overflow para renderizar con @RestController
    @RequestMapping("/")
    public ModelAndView welcome() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login.html");
        return modelAndView;
    }
    }
    */
}
