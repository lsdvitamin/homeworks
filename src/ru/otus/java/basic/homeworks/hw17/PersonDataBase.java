package ru.otus.java.basic.homeworks.hw17;

import java.util.*;

/**
 * @author Sergei on 06.06.2024 15:04.
 * @progect homeworks
 */
public class PersonDataBase {
    private Map<Long, Person> persons = new HashMap<>();

    Set<String> managerPosSet = new HashSet<>(Arrays.asList("MANAGER", "DIRECTOR", "BRANCH_DIRECTOR", "SENIOR_MANAGER"));

    public PersonDataBase(Person person) {
        this.persons.put(person.getId(), person);
    }

    /**
     * Добавляет человека в список
     *
     * @param person экземпляр человека
     */
    public void add(Person person) {
        this.persons.put(person.getId(), person);
    }

    /**
     * Поиск человека в списке по ID
     *
     * @param id идентификатор человека
     * @return
     */
    public Person findById(Long id) {
        return persons.get(id);
    }

    /**
     * Проверяет, является ли человек менеджером. Если да, то вернет true, иначе false
     *
     * @param person
     * @return
     */
    public boolean isManager(Person person) {
        if (managerPosSet.contains(person.position)) {
            return true;
        }
        return false;
    }

    /**
     * Проверяет, является ли человек рабочим. Если да, то вернет true, иначе false
     *
     * @param person
     * @return
     */
    public boolean isEmployee(Person person) {
        if (!managerPosSet.contains(person.position)) {
            return true;
        }
        return false;
    }

}
