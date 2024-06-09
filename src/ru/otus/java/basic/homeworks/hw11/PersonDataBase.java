package ru.otus.java.basic.homeworks.hw11;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergei on 06.06.2024 15:04.
 * @progect homeworks
 */
public class PersonDataBase {
    private List<Person> persons = new ArrayList<>();

    public PersonDataBase(Person person) {
        this.persons.add(person);
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public Person findById(Long id) {
        return persons.get(Math.toIntExact(id - 1));
    }

    public boolean isManager(Person person) {
        if (String.valueOf(person.position).matches("MANAGER|DIRECTOR|BRANCH_DIRECTOR|SENIOR_MANAGER")) {
            return true;
        }
        return false;
    }

    public boolean isEmployee(Person person) {
        if (!String.valueOf(person.position).matches("MANAGER|DIRECTOR|BRANCH_DIRECTOR|SENIOR_MANAGER")) {
            return true;
        }
        return false;
    }

}
