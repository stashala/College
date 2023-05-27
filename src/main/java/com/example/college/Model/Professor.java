package com.example.college.Model;

import javax.persistence.*;
import java.util.*;
import java.util.ArrayList;

@Entity
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lastName;
    private String firstName;
    @OneToMany(mappedBy = "professor", fetch = FetchType.EAGER)
    private List<Project> projects = new ArrayList<>();

    public Professor() {
    }

    public Professor(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public void addProject(Project project){
        projects.add(project);
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

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", projects=" + projects +
                '}';
    }
}
