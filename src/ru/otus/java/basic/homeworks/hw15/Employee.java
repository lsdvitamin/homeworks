package ru.otus.java.basic.homeworks.hw15;

/**
 * @author Sergei on 26.05.2024 13:36.
 * @project homeworks
 */
public class Employee {
    private final String NAME;
    private final int AGE;

    public Employee(String name, int age) {
        NAME = name;
        AGE = age;
    }

    public String getNAME() {
        return NAME;
    }

    public int getAGE() {
        return AGE;
    }

}
