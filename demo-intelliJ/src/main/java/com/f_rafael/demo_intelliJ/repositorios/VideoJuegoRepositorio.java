package com.f_rafael.demo_intelliJ.repositorios;

import com.f_rafael.demo_intelliJ.entidades.VideoJuego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoJuegoRepositorio extends JpaRepository<VideoJuego,Long> {
}
