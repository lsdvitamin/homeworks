package ru.otus.java.basic.homeworks.hw10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Sergei on 29.05.2024 14:33.
 * @progect homeworks
 */
public class PhoneBook {
    private Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public PhoneBook(Map<String, ArrayList<String>> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public PhoneBook(String petrov, List<String> phones) {
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
        phoneBook.put(lastName, (ArrayList<String>) phones);
    }

    /**
     * Проверяет по фамилии, есть ли в справочнике контакт
     *
     * @param lastName Фамилия
     * @return Результат, если есть, то вернет true, иначе false
     */
    public boolean containslastName(String lastName) {
        if (phoneBook.containsKey(lastName)) {
            return true;
        }
        return false;
    }

    /**
     * Проверяет, есть ли в справочнике такой телефон
     *
     * @param phone Номер телефона
     * @return Результат, если есть, то вернет true, иначе false
     */
    public boolean containsPhoneNumber(String phone) {
        List<String> phones = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> lastName : phoneBook.entrySet()) {
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
        if (containslastName(lastName)) {
            ArrayList phones = this.phoneBook.get(lastName);
            phones.add(phone);
            this.phoneBook.put(lastName, phones);
        } else if (this.phoneBook.size() == 0 || !containslastName(lastName)) {
            createNewContact(lastName, phone);
        }
    }

    public void print() {
        for (Map.Entry<String, ArrayList<String>> lastName : phoneBook.entrySet()) {
            System.out.print(lastName.getKey() + ": ");
            System.out.println(lastName.getValue());
        }
    }

    public ArrayList<String> find(String lastName) {
        return phoneBook.get(lastName);
    }

}
