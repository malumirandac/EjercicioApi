package com.example.ejercicioapi.services;

import com.example.ejercicioapi.models.Tarea;

import java.util.List;

public interface TareaService {
    //definir metodos

    List<Tarea> listaTareas();

    Tarea guardarTarea(Tarea nuevaTarea);

    Tarea editarTareaPorId(Long id, Tarea tareaActualizado);

    void borrarTarea(Long id);

}
