package ru.otus.java.basic.homeworks.hw16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Sergei on 29.05.2024 14:33.
 * @project homeworks
 */
public class PhoneBook {
    private Map<String, ArrayList<String>> phoneDirectory = new HashMap<>();

    public PhoneBook(Map<String, ArrayList<String>> phoneBook) {
        this.phoneDirectory = phoneBook;
    }

    /**
     * Создает новый контакт в стправочнике
     *
     * @param lastName Фамилия
     * @param phone    Номер телефона
     */
    public void createNewContact(String lastName, String phone) {
        List<String> phones = new ArrayList<>();
        phones.add(phone);
        phoneDirectory.put(lastName, (ArrayList<String>) phones);
    }

    /**
     * Проверяет по фамилии, есть ли в справочнике контакт
     *
     * @param lastName Фамилия
     * @return Результат, если есть, то вернет true, иначе false
     */
    public boolean containsLastName(String lastName) {
        return phoneDirectory.containsKey(lastName);
    }

    /**
     * Проверяет, есть ли в справочнике такой телефон
     *
     * @param phone Номер телефона
     * @return Результат, если есть, то вернет true, иначе false
     */
    public boolean containsPhoneNumber(String phone) {
        for (Map.Entry<String, ArrayList<String>> lastName : phoneDirectory.entrySet()) {
            if (lastName.getValue().contains(phone)) {
                return true;
            }
        }
        return false;
    }


    /**
     * Если контакта нет, то добавляет новый контакт в справочник, если контакт уже есть, то добавляет новый номер для
     * этого контакта
     *
     * @param lastName Фамилия
     * @param phone    Номер телефона
     */
    public void add(String lastName, String phone) {
        if (containsLastName(lastName)) {
            List phones = this.phoneDirectory.get(lastName);
            phones.add(phone);
            this.phoneDirectory.put(lastName, (ArrayList<String>) phones);
        } else if (this.phoneDirectory.size() == 0 || !containsLastName(lastName)) {
            createNewContact(lastName, phone);
        }
    }

    public void print() {
        for (Map.Entry<String, ArrayList<String>> lastName : phoneDirectory.entrySet()) {
            System.out.print(lastName.getKey() + ": ");
            System.out.println(lastName.getValue());
        }
    }

    public List<String> find(String lastName) {
        return phoneDirectory.get(lastName);
    }

}
