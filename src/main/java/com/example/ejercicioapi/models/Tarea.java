package com.example.ejercicioapi.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "tareas")
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tareaId;

    @Column(name = "titulo")
    @NotNull
    private String tituloTarea;

    @Column(name = "descripcion")
    private String descripcionTarea;

    @Column(name = "fecha_vencimiento")
    @DateTimeFormat(pattern = "yy-MM-dd")
    @NotNull
    private Date vencimientoTarea;

    @ManyToOne
    @JoinColumn(name = "usuarioId", nullable = false)
    private Usuario usuario;



    @OneToMany(mappedBy = "tarea")
    private List<Comentario> comentarios;











}
