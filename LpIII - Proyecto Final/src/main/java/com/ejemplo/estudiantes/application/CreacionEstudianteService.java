package com.ejemplo.estudiantes.application;

import com.ejemplo.estudiantes.application.mapper.EstudianteMapper;
import com.ejemplo.estudiantes.domain.Estudiante;
import com.ejemplo.estudiantes.infrastructure.repository.VerEstudianteRepository;
import com.ejemplo.estudiantes.infrastructure.repository.model.EstudianteEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreacionEstudianteService {

    private final VerEstudianteRepository verEstudianteRepository;

    public Estudiante crearEstudiante(Estudiante estudiante) {
        EstudianteEntity entity = EstudianteMapper.INSTANCE.mapToEntity(estudiante);
        EstudianteEntity estudianteR = verEstudianteRepository.save(entity);

        return EstudianteMapper.INSTANCE.mapToDomain(estudianteR);
    }
}
