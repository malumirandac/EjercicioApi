package com.example.ejercicioapi.services;

import com.example.ejercicioapi.models.Comentario;
import com.example.ejercicioapi.repositories.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioServiceImpl implements ComentarioService{

    @Autowired
    ComentarioRepository comentarioRepository;
    @Override
    public List<Comentario> listaComentarios(){
        return comentarioRepository.findAll();
    }
    @Override
    public Comentario guardarComentario(Comentario nuevoComentario){
        return comentarioRepository.save(nuevoComentario);
    }
    @Override
    public Comentario editarComentarioPorId(Long id, Comentario comentarioActualizado){
        Boolean existe = comentarioRepository.existsById(id);
        if (existe){
            Comentario comentarioSeleccionado = comentarioRepository.findById(id).get();
            comentarioSeleccionado.setTextoComentario(comentarioActualizado.getTextoComentario());
            comentarioSeleccionado.setCreacionComentario(comentarioActualizado.getCreacionComentario());
            System.out.println("el comentario ha sido actualizado");
            return comentarioRepository.save(comentarioSeleccionado);
        }else{
            System.out.println("El comentario no existe o el id es inválido");
            return null;
        }
    }
    @Override
    public void borrarComentario(Long id){
        comentarioRepository.deleteById(id);
    }

}
