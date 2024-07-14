package ru.otus.java.basic.homeworks.hw10;

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

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public String getEmail() {
        return email;
    }


    /**
     * Выводит иныормацию о пользователе
     */
    public void printInfoAboutUser(){
        System.out.println("ФИО: " + getLastName() + " " + getFirstName() + " " +getMiddleName());
        System.out.println("Год рождения: " + getYearOfBirth());
        System.out.println("e-mail: " + getEmail());
    }

}
