package ru.otus.java.basic.homeworks;

import static ru.otus.java.basic.homeworks.hw1.hw1.*;
import static ru.otus.java.basic.homeworks.hw2.hw2.*;
import static ru.otus.java.basic.homeworks.util.inputNumber;

public class Main {
    public static void main(String[] args) {
        int numberOfHomework = 0;
        System.out.print("\nВведите номер ДЗ(1-2)  /0-выход/: ");
        numberOfHomework = inputNumber();
        if (numberOfHomework == 1) {
            coreHomework1();
        } else if (numberOfHomework == 2) {
            coreHomework2();
        } else if (numberOfHomework == 0) {
            System.out.println("Выход");
        } else {
            System.out.println("Похоже что такое ДЗ я еще не сделал :(");
        }
    }


}
