package com.example.ejercicioapi.services;

import com.example.ejercicioapi.models.Usuario;
import com.example.ejercicioapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> listaUsuarios(){
        return usuarioRepository.findAll();
    }
    @Override
    public Usuario guardarUsuario(Usuario nuevoUsuario){
        return usuarioRepository.save(nuevoUsuario);
    }

    @Override
    public Usuario editarUsuarioPorId(Long id, Usuario usuarioActualizado){
        Boolean existe = usuarioRepository.existsById(id);

        if (existe) {
            Usuario usuarioSeleccionado = usuarioRepository.findById(id).get();
            usuarioSeleccionado.setUsuarioNombre(usuarioActualizado.getUsuarioNombre());
            usuarioSeleccionado.setEmail(usuarioActualizado.getEmail());
            System.out.println("El estudiante ha sido actualizado");
            return usuarioRepository.save(usuarioSeleccionado);

        }else{
            System.out.println("El estudiante no existe o el id es inválido");
            return null;
        }
    }

    @Override
    public void borrarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }


}
