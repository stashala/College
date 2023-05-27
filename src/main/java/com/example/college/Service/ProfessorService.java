package com.example.college.Service;

import com.example.college.DTO.ProfessorProjectDTO;
import com.example.college.Repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    @Autowired
    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public List<ProfessorProjectDTO> getProjectThemesWithProfessor(){
        return professorRepository.getProjectThemesWithProfessor();
    }

}
