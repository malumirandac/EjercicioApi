package com.example.ejercicioapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioId;

    @Column(name = "nombre")
    @NotNull
    private String usuarioNombre;

    @Email
    @NotNull
    private String email;


    //ACÁ INGRESAR ANOTACIONES DE MUCHOS A MUCHOS

    //@JsonIgnore

    @OneToMany(mappedBy = "usuario")
    private List<Tarea> tareas;



}
