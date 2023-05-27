package com.example.college.Repository;

import com.example.college.DTO.ProfessorProjectDTO;
import com.example.college.Model.Professor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.*;

public interface ProfessorRepository extends CrudRepository<Professor, Long> {

    @Query("SELECT DISTINCT new com.example.college.DTO.ProfessorProjectDTO(p.theme, i.lastName, i.firstName) " +
            "FROM Project p " +
            "JOIN p.professor i " +
            "ORDER BY p.theme ASC")
    List<ProfessorProjectDTO> getProjectThemesWithProfessor();


}
