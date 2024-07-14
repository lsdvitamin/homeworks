package ru.otus.java.basic.homeworks.hw17;

/**
 * @author Sergei on 06.06.2024 15:01.
 * @progect homeworks
 */
public class Person {
    String name;
    Position position;
    Long id;

    public Person(String name, Position position, Long id) {
        this.name = name;
        this.position = position;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void print() {
        System.out.println("ID: " + id + "\nNAME: " + name + "\nPOSITION: " + position);
    }

}