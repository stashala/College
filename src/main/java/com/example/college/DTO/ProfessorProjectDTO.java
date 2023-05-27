package com.example.college.DTO;

public class ProfessorProjectDTO {

    private String theme;
    private String lastName;
    private String firstName;

    public ProfessorProjectDTO() {
    }

    public ProfessorProjectDTO(String theme, String lastName, String firstName) {
        this.theme = theme;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getTheme() {
        return theme;
    }

    public void setTopic(String theme) {
        this.theme = theme;
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

    @Override
    public String toString() {
        return "ProfessorProjectDTO{" +
                "theme='" + theme + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
