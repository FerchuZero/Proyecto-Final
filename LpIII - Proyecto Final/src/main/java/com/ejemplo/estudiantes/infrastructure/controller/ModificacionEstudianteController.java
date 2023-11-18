package com.ejemplo.estudiantes.infrastructure.controller;

import com.ejemplo.estudiantes.application.ModificacionEstudianteService;
import com.ejemplo.estudiantes.domain.Estudiante;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("estudiantes")
@RequiredArgsConstructor
public class ModificacionEstudianteController {

    private final ModificacionEstudianteService modificacionEstudianteService;

    @PutMapping("/{id}")
    public Estudiante modificarEstudiante(@PathVariable long id, @RequestBody Estudiante estudiante){

        log.info("Se está modificando un estudiante");
        return modificacionEstudianteService.modificarEstudiante(estudiante, id);
    }

}
