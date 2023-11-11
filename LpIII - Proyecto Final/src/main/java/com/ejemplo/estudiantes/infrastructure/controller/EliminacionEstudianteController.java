package com.ejemplo.estudiantes.infrastructure.controller;

import com.ejemplo.estudiantes.application.EliminacionEstudianteService;
import com.ejemplo.estudiantes.application.VerEstudianteService;
import com.ejemplo.estudiantes.domain.Estudiante;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("estudiantes")
@RequiredArgsConstructor
public class EliminacionEstudianteController {

    private final EliminacionEstudianteService eliminacionEstudianteService;

    @DeleteMapping("/{id}")
    public void eliminarEstudiante(@PathVariable("id") Long estudianteId){
        log.info("Se está eliminando un estudiante");
        eliminacionEstudianteService.eliminarEstudiante(estudianteId);
    }
}
