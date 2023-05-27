package com.example.college.DTO;

public class StudentTeamProjectDTO {
    private String firstName;
    private String lastName;
    private String TeamName;
    private String projectTheme;

    public StudentTeamProjectDTO() {
    }

    public StudentTeamProjectDTO(String firstName, String lastName, String TeamName, String projectTheme) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.TeamName = TeamName;
        this.projectTheme = projectTheme;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTeamName() {
        return TeamName;
    }

    public void setTeamName(String teamName) {
        TeamName = teamName;
    }

    public String getProjectTheme() {
        return projectTheme;
    }

    public void setProjectTheme(String projectTheme) {
        this.projectTheme = projectTheme;
    }

    @Override
    public String toString() {
        return "StudentTeamProjectDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", TeamName='" + TeamName + '\'' +
                ", projectTheme='" + projectTheme + '\'' +
                '}';
    }
}
