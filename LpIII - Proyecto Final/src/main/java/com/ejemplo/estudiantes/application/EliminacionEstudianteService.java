package com.ejemplo.estudiantes.application;

import com.ejemplo.estudiantes.infrastructure.repository.VerEstudianteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EliminacionEstudianteService {

    private final VerEstudianteRepository verEstudianteRepository;

    public void eliminarEstudiante(Long estudianteId){
        verEstudianteRepository.deleteById(estudianteId);
    }
}
