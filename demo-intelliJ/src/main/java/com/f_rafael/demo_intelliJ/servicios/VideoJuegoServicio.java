package com.f_rafael.demo_intelliJ.servicios;

import com.f_rafael.demo_intelliJ.entidades.VideoJuego;
import com.f_rafael.demo_intelliJ.repositorios.VideoJuegoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoJuegoServicio {

    @Autowired
    private VideoJuegoRepositorio videoJuegoRepositorio;

    public List<VideoJuego> devolverVideoJuegos(){
        return videoJuegoRepositorio.findAll();
    }

    public void guardarVideoJuego(VideoJuego videoJuego){
        videoJuegoRepositorio.save(videoJuego);
    }
}
