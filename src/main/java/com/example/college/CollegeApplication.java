package com.example.college;

import com.example.college.Repository.ProfessorRepository;
import com.example.college.Repository.StudentRepository;
import com.example.college.Service.ProfessorService;
import com.example.college.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CollegeApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CollegeApplication.class, args);
        ProfessorRepository professorRepository = context.getBean(ProfessorRepository.class);
        StudentRepository studentRepository = context.getBean(StudentRepository.class);

        StudentService studentService = context.getBean(StudentService.class);
        ProfessorService professorService = context.getBean(ProfessorService.class);

        studentRepository.findAll().forEach(System.out::println);
        System.out.println("============\n" + studentService.getAverageAnnualAverage());
        System.out.println("============\n" + studentService.getStudentsWithTeamAndProjects());

    }

}
