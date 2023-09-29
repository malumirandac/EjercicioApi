package com.example.ejercicioapi.services;

import com.example.ejercicioapi.models.Usuario;

import java.util.List;

public interface UsuarioService {
    //definir metodos

    List<Usuario> listaUsuarios();

    Usuario guardarUsuario(Usuario nuevoUsuario);

    Usuario editarUsuarioPorId(Long id, Usuario usuarioActualizado);

    void borrarUsuario(Long id);


}
