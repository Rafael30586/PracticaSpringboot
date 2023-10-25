package com.Holasoft.Quehace.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class Controlador {

    @GetMapping("/saludo")
    public String saludar(){
        return "Hola mundo";
    }

    @GetMapping("/saludoOtraVez/{numerito}") //Ejemplo http://localhost:8080/saludoOtraVez?numerito=3
    public String saludarotraVez(@RequestParam int numerito){
        return "Sos un "+numerito;
    }

    //@ResponseBody renderiza el nombre del archivo en lugar de el archivo en si cuando se usa @Controller
    @GetMapping("/Chief")
    public String mostrarChief(Model model){
        model.addAttribute("casco","Maestro");

        return "masterChief.html";
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
