package com.example.college.Model;

import javax.persistence.*;
import java.util.*;
import java.util.ArrayList;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastName;
    private String firstName;
    private Double annualAverage;
    @ManyToOne
    @JoinColumn(name = "id_team")
    private Team team;
    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
    private List<Project> projects = new ArrayList<>();

    public Student() {
    }

    public Student(String lastName, String firstName, Double annualAverage, Team team) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.annualAverage = annualAverage;
        this.team = team;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Double getAnnualAverage() {
        return annualAverage;
    }

    public void setAnnualAverage(Double annualAverage) {
        this.annualAverage = annualAverage;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", annualAverage=" + annualAverage +
                ", projects=" + projects +
                '}';
    }
}
