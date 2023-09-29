package com.example.ejercicioapi.repositories;

import com.example.ejercicioapi.models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepository extends JpaRepository<Tarea, Long> {

}
