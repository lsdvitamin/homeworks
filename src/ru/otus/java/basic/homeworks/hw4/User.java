package ru.otus.java.basic.homeworks.hw4;

import java.util.Random;

/**
 * класс Пользователь
 * @author Sergei on 05.05.2024 14:24.
 * @progect homeworks
 */
public class User {
    private String lastName;
    private String firstName;
    private String middleName;
    private int yearOfBirth;
    private String email;

    public User(String lastName, String firstName, String middleName, int yearOfBirth, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.yearOfBirth = yearOfBirth;
        this.email = email;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void pringInfoAboutUser(User user){
        System.out.println("ФИО: " + getLastName() + " " + getFirstName() + " " +getMiddleName());
        System.out.println("Год рождения: " + getYearOfBirth());
    }

}
