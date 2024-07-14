package ru.otus.java.basic.homeworks.hw16;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Sergei on 28.05.2024 16:43.
 * @progect homeworks
 */
public class Hw16 {

    /**
     * Обеспечивает выбор метода в ДЗ-16 и выход к выбору ДЗ
     */
    public static void coreHomework16() {
        System.out.println("----------------Домашнее задание #16-----------------");
        PhoneBook phoneBookOwn;
        phoneBookOwn = new PhoneBook(new HashMap<String, ArrayList<String>>(1));
        phoneBookOwn.add("Petrov", "8(950)850-40-25");
        phoneBookOwn.add("Sidorov", "8(980)320-50-20");
        phoneBookOwn.add("Popov", "8(910)210-45-11");
        phoneBookOwn.add("Petrov", "8(950)850-40-26");
        phoneBookOwn.add("Smirnov", "8(905)020-48-32");
        phoneBookOwn.add("Petrov", "8(950)850-40-27");
        phoneBookOwn.add("Smirnov", "8(905)020-48-33");
        phoneBookOwn.print();
        System.out.println("--------------- Поиск по фамилии--------------");
        String searchPerson = "Smirnov";
        System.out.println(searchPerson + ": " + phoneBookOwn.find(searchPerson));
        System.out.println("----------------- Поиск по имени -----------------");
        System.out.println(phoneBookOwn.containsPhoneNumber("8(905)020-48-38") ? "Телефон найден" : "Телефон не найден");
        System.out.println(phoneBookOwn.containsPhoneNumber("8(905)020-48-32") ? "Телефон найден" : "Телефон не найден");

    }

}
