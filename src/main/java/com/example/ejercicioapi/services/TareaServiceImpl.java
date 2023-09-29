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
    @Override
    public Tarea editarTareaPorId(Long id, Tarea tareaActualizado){
        Boolean existe = tareaRepository.existsById(id);
        if (existe){
            Tarea tareaSeleccionado = tareaRepository.findById(id).get();
            tareaSeleccionado.setTituloTarea(tareaActualizado.getTituloTarea());
            tareaSeleccionado.setDescripcionTarea(tareaActualizado.getDescripcionTarea());
            tareaSeleccionado.setVencimientoTarea(tareaActualizado.getVencimientoTarea());
            System.out.println("la tarea ha sido actualizada");
            return tareaRepository.save(tareaSeleccionado);
        }else{
            System.out.println("La tarea no existe o el id es inválido");
            return null;
        }
    }
    @Override
    public void borrarTarea(Long id){
        tareaRepository.deleteById(id);
    }

}
