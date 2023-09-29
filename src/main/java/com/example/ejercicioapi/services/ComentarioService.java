package com.example.ejercicioapi.services;

import com.example.ejercicioapi.models.Comentario;

import java.util.List;

public interface ComentarioService {
    //definir metodos

    List<Comentario> listaComentarios();

    Comentario guardarComentario(Comentario nuevoComentario);

    Comentario editarComentarioPorId(Long id, Comentario comentarioActualizado);

    void borrarComentario(Long id);
}
