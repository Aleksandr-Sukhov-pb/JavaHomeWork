package com.pb.sukhov.hw11;
//import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
//import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;

class Person  {
    //  public static String toString;
    //@JsonDeserialize(using = LocalDateDeserializer.class)
    //@JsonSerialize(using = LocalDateSerializer.class)
    private int index;
    private String lastName;
    private String firstName;
    private String phone;
    private String addres;
    private LocalDate dateOfBirth;


    public Person() {
    }
    public int getIndex() {
        return index;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getAddres() {
        return addres;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddres(String address) {
        this.addres = addres;
    }


    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }




    public Person(int index, String lastName, String firstName, String phone, String addres, LocalDate dateOfBirth) {
        this.index = index;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
        this.addres = addres;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "index='" + index + '\'' +
                ", lastName='" + lastName + '\'' +
                ", firstname='" + firstName + '\'' +
                ", phone='" + phone + '\'' +
                ", addres='" + addres + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}