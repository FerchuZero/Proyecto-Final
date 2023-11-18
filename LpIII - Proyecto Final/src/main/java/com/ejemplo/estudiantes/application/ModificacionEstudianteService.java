package com.ejemplo.estudiantes.application;

import com.ejemplo.estudiantes.application.mapper.EstudianteMapper;
import com.ejemplo.estudiantes.domain.Estudiante;
import com.ejemplo.estudiantes.infrastructure.controller.ModificacionEstudianteController;
import com.ejemplo.estudiantes.infrastructure.repository.VerEstudianteRepository;
import com.ejemplo.estudiantes.infrastructure.repository.model.EstudianteEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ModificacionEstudianteService {

    private final VerEstudianteService verEstudianteService;
    private final VerEstudianteRepository verEstudianteRepository;

    public Estudiante modificarEstudiante(Estudiante estudiante, long id){

        Estudiante estudianteAnterior = verEstudianteService.obtenerEstudiantePorId(id);
        EstudianteEntity entity = EstudianteMapper.INSTANCE.mapToEntity(estudianteAnterior);

        entity.setNombre(estudiante.getNombre());
        entity.setApellido(estudiante.getApellido());
        entity.setEdad(estudiante.getEdad());

        EstudianteEntity entityR = verEstudianteRepository.save(entity);

        return EstudianteMapper.INSTANCE.mapToDomain(entityR);
    }
}
