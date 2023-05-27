package com.example.college.Service;

import com.example.college.DTO.StudentDTO;
import com.example.college.DTO.StudentTeamDTO;
import com.example.college.DTO.StudentTeamProjectDTO;
import com.example.college.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.DecimalFormat;
import java.util.List;

@Service
public class StudentService {

    private final DecimalFormat decimalFormat = new DecimalFormat("#.00");

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<StudentDTO> getStudentsWithHigherAverage() {
        return studentRepository.getStudentsWithHigherAverage();
    }

    public Double getAverageAnnualAverage() {
       return Double.parseDouble(decimalFormat.format(studentRepository.getAverageAnnualAverage()));
    }

    public List<StudentTeamDTO> getStudentsWithTeam() {

        List<StudentTeamDTO> returnList = studentRepository.getStudentsWithTeam()
                .stream().map(x -> {
                    if (x.getTeamName() == null) {
                        x.setTeamName("BRAK");
                    }
                    return x;
                }).toList();
        return returnList;
    }

    public List<StudentTeamProjectDTO> getStudentsWithTeamAndProjects(){
        return studentRepository.getStudentsWithTeamAndProjects();
    }

}
