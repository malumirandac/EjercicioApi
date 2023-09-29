package com.example.ejercicioapi.controllers;

import com.example.ejercicioapi.models.Tarea;
import com.example.ejercicioapi.services.TareaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarea")
public class TareaRestController {
    @Autowired
    TareaServiceImpl tareaService;


    @GetMapping("/lista")
    public List<Tarea> enlistarTareas(){
        return tareaService.listaTareas();
    }
    @PostMapping("/nuevo")
    public Tarea nuevaTarea(@RequestBody Tarea nuevaTarea){
        return tareaService.guardarTarea(nuevaTarea);
    }

}
