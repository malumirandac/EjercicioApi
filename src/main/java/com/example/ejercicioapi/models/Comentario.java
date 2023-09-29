package com.example.ejercicioapi.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "comentarios")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comentarioId;

    @Column(name = "texto")
    private String textoComentario;

    @Column(name = "fechaCreacion")
    private Date creacionComentario;

    @ManyToOne
    @JoinColumn(name = "tareaId")
    private Tarea tarea;

}


