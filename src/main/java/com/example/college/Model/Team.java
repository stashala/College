package com.example.college.Model;

import javax.persistence.*;
import java.util.*;
import java.util.ArrayList;
@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "team", fetch = FetchType.EAGER)
    private List<Student> students = new ArrayList<>();

    public Team() {
    }

    public Team(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }



    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
