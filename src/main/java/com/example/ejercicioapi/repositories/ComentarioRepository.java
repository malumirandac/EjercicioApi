package com.example.ejercicioapi.repositories;

import com.example.ejercicioapi.models.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {
}
