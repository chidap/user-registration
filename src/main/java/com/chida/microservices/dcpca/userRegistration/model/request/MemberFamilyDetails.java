package com.chida.microservices.dcpca.userRegistration.model.request;

import java.time.LocalDate;

public class MemberFamilyDetails {

    ////////////// private members //////////////////

    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String relation;

    ////////////////// Setters and Getters ///////////


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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }
}
