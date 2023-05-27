package com.example.college.DTO;

public class StudentDTO {

    private String firstName;
    private String lastName;
    private Double annualAverage;

    public StudentDTO() {
    }

    public StudentDTO(String firstName, String lastName, Double annualAverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualAverage = annualAverage;
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

    public Double getAnnualAverage() {
        return annualAverage;
    }

    public void setAnnualAverage(Double annualAverage) {
        this.annualAverage = annualAverage;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", annualAverage=" + annualAverage +
                '}';
    }
}
