package com.example.college.Model;

import javax.persistence.*;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String theme;
    private Long points;
    @ManyToOne
    @JoinColumn(name = "id_student")
    private Student student;
    @ManyToOne
    @JoinColumn(name = "id_professor")
    private Professor professor;

    public Project() {
    }

    public Project(String theme, Long points, Student student, Professor professor) {
        this.theme = theme;
        this.points = points;
        this.student = student;
        this.professor = professor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String subject) {
        this.theme = subject;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", theme='" + theme + '\'' +
                ", points=" + points +
                '}';
    }
}
