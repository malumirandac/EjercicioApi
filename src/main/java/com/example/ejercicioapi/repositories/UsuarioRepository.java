package com.example.ejercicioapi.repositories;

import com.example.ejercicioapi.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
