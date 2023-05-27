package com.example.college.Controller;

import com.example.college.DTO.ProfessorProjectDTO;
import com.example.college.Service.ProfessorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProfessorController {

    private final ProfessorService professorService;

    public ProfessorController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @GetMapping("/projects")
    public String getProfessors(Model model){
        List<ProfessorProjectDTO> projectThemesWithProfessor = professorService.getProjectThemesWithProfessor();
        model.addAttribute("professors", projectThemesWithProfessor);
        return "professors";
    }

}
