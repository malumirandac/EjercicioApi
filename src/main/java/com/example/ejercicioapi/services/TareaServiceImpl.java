package com.example.ejercicioapi.services;

import com.example.ejercicioapi.models.Tarea;
import com.example.ejercicioapi.repositories.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaServiceImpl implements TareaService{

    @Autowired
    TareaRepository tareaRepository;

    @Override
    public List<Tarea> listaTareas(){
        return tareaRepository.findAll();
    }
    @Override
    public Tarea guardarTarea(Tarea nuevaTarea){
        return tareaRepository.save(nuevaTarea);
    }

}
