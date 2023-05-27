package com.example.college.Repository;

import com.example.college.DTO.StudentDTO;
import com.example.college.DTO.StudentTeamDTO;
import com.example.college.DTO.StudentTeamProjectDTO;
import com.example.college.Model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface StudentRepository extends CrudRepository<Student, Long> {

    @Query("SELECT new com.example.college.DTO.StudentDTO(s.firstName, s.lastName, s.annualAverage) " +
            "FROM Student s " +
            "WHERE s.annualAverage > (SELECT AVG(s2.annualAverage) FROM Student s2)")
    List<StudentDTO> getStudentsWithHigherAverage();

    @Query("SELECT AVG(s.annualAverage) FROM Student s")
    Double getAverageAnnualAverage();

    @Query("SELECT new com.example.college.DTO.StudentTeamDTO(s.firstName, s.lastName, g.name) " +
            "FROM Student s " +
            "LEFT JOIN s.team g")
    List<StudentTeamDTO> getStudentsWithTeam();

    @Query("SELECT new com.example.college.DTO.StudentTeamProjectDTO(s.firstName, s.lastName, g.name, p.theme) " +
            "FROM Student s " +
            "JOIN s.team g " +
            "JOIN s.projects p " +
            "ORDER BY s.id")
    List<StudentTeamProjectDTO> getStudentsWithTeamAndProjects();
}
