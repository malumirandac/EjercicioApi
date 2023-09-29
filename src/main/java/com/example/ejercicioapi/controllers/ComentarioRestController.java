package com.example.ejercicioapi.controllers;

import com.example.ejercicioapi.models.Comentario;
import com.example.ejercicioapi.services.ComentarioService;
import com.example.ejercicioapi.services.ComentarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comentario")
public class ComentarioRestController {
    @Autowired
    ComentarioServiceImpl comentarioService;

    @GetMapping("/lista")
    public List<Comentario> enlistarComentarios() {
        return comentarioService.listaComentarios();
    }
    @PostMapping("/nuevo")
    public Comentario nuevoComentario(@RequestBody Comentario nuevoComentario){
        return comentarioService.guardarComentario(nuevoComentario);
    }
    @PutMapping("/editar/{id}")
    public Comentario editarComentarioPorId(@PathVariable Long id, @RequestBody Comentario comentarioActualizado){
        Comentario comentarioEditado = comentarioService.editarComentarioPorId(id, comentarioActualizado);
        return comentarioEditado;
    }
    @DeleteMapping("/borrar")
    public String borrarComentarioPorId(@RequestParam Long id){
        comentarioService.borrarComentario(id);
        return "El comentario ha sido borrado";
    }
}
