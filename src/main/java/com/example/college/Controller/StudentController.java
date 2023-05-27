package com.example.college.Controller;

import com.example.college.DTO.StudentDTO;
import com.example.college.DTO.StudentTeamDTO;
import com.example.college.DTO.StudentTeamProjectDTO;
import com.example.college.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String getStudents(Model model){
        List<StudentTeamProjectDTO> studentsWithTeamAndProjects = studentService.getStudentsWithTeamAndProjects();
        model.addAttribute("students", studentsWithTeamAndProjects);
        return "students";
    }

    @GetMapping("/students/teams")
    public String getStudentGroups(Model model) {
        List<StudentTeamDTO> studentTeams = studentService.getStudentsWithTeam();
        model.addAttribute("studentTeams", studentTeams);
        return "student-teams";
    }
    @GetMapping("/students/average")
    public String getStudentsWithHigherAverage(Model model) {
        List<StudentDTO> studentsWithHigherAverage = studentService.getStudentsWithHigherAverage();
        Double averageAnnualAverage = studentService.getAverageAnnualAverage();
        model.addAttribute("studentsWithHigherAverage", studentsWithHigherAverage);
        model.addAttribute("averageAnnualAverage", averageAnnualAverage);
        return "students-average";
    }

}
