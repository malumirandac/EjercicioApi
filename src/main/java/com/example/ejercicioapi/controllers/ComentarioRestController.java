package com.example.ejercicioapi.controllers;

import com.example.ejercicioapi.services.ComentarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComentarioRestController {
    @Autowired
    ComentarioServiceImpl comentarioService;

}
