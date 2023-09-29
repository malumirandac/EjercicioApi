package com.example.ejercicioapi.controllers;

import com.example.ejercicioapi.models.Usuario;
import com.example.ejercicioapi.services.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {
    @Autowired
    UsuarioServiceImpl usuarioService;

    @GetMapping("/lista")
    public List<Usuario> enlistarUsuarios(){
        return usuarioService.listaUsuarios();
    }
    @PostMapping("/nuevo")
    public Usuario nuevoUsuario(@RequestBody Usuario nuevoUsuario){
        return usuarioService.guardarUsuario(nuevoUsuario);
    }
    @PutMapping("/editar/{id}")
    public Usuario editarUsuarioPorId(@PathVariable Long id, @RequestBody Usuario usuarioActualizado){
        Usuario usuarioEditado = usuarioService.editarUsuarioPorId(id, usuarioActualizado);
        return usuarioEditado;
    }
    @DeleteMapping("/borrar")
    public String borrarUsuarioPorId(@RequestParam Long id){
        usuarioService.borrarUsuario(id);
        return "El estudiante ha sido borrado";
    }


}
