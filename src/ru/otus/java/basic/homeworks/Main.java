package ru.otus.java.basic.homeworks;

import static ru.otus.java.basic.homeworks.Util.inputNumber;
import static ru.otus.java.basic.homeworks.hw1.Hw1.coreHomework1;
import static ru.otus.java.basic.homeworks.hw2.Hw2.coreHomework2;
import static ru.otus.java.basic.homeworks.hw3.Hw3.coreHomework3;
import static ru.otus.java.basic.homeworks.hw4.Hw4.coreHomework4;
import static ru.otus.java.basic.homeworks.hw5.Hw5.coreHomework5;
import static ru.otus.java.basic.homeworks.hw6.Hw6.coreHomework6;
import static ru.otus.java.basic.homeworks.Hw9.Hw9.coreHomework9;

public class Main {
    public static void main(String[] args) {
        int numberOfHomework = 0;
        while (numberOfHomework != 99) {
            System.out.print("\nВведите номер ДЗ(1-3)  /99-выход/: ");
            numberOfHomework = inputNumber();
            if (numberOfHomework == 1) {
                coreHomework1();
            } else if (numberOfHomework == 2) {
                coreHomework2();
            } else if (numberOfHomework == 3) {
                coreHomework3();
            } else if (numberOfHomework == 4) {
                coreHomework4();
            } else if (numberOfHomework == 5) {
                coreHomework5();
            } else if (numberOfHomework == 6) {
                coreHomework6();
            }  else if (numberOfHomework == 9) {
                coreHomework9();
            } else if (numberOfHomework == 99) {
                System.out.println("Выход");
            } else {
                System.out.println("Похоже что такое ДЗ я еще не сделал :(");
            }
        }
    }
}
