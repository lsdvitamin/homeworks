package ru.otus.java.basic.homeworks;

import java.io.IOException;

import static ru.otus.java.basic.homeworks.Util.inputNumber;
import static ru.otus.java.basic.homeworks.hw10.Hw10.coreHomework10;
import static ru.otus.java.basic.homeworks.hw11.Hw11.coreHomework11;
import static ru.otus.java.basic.homeworks.hw12.Hw12.coreHomework12;
import static ru.otus.java.basic.homeworks.hw13.Hw13.coreHomework13;
import static ru.otus.java.basic.homeworks.hw14.Hw14.coreHomework14;
import static ru.otus.java.basic.homeworks.hw15.Hw15.coreHomework15;
import static ru.otus.java.basic.homeworks.hw16.Hw16.coreHomework16;
import static ru.otus.java.basic.homeworks.hw17.Hw17.coreHomework17;
import static ru.otus.java.basic.homeworks.hw19.Hw19.coreHomework19;
import static ru.otus.java.basic.homeworks.hw21.Hw21.coreHomework21;
import static ru.otus.java.basic.homeworks.hw3.Hw3.coreHomework3;
import static ru.otus.java.basic.homeworks.hw5.Hw5.coreHomework5;
import static ru.otus.java.basic.homeworks.hw7.Hw7.coreHomework7;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int numberOfHomework = 0;
        while (numberOfHomework != 99) {
            System.out.print("\nВведите номер ДЗ(1-21)  /99-выход/: ");
            numberOfHomework = inputNumber();
            if (numberOfHomework == 3) {
                coreHomework3();
            } else if (numberOfHomework == 5) {
                coreHomework5();
            } else if (numberOfHomework == 7) {
                coreHomework7();
            } else if (numberOfHomework == 10) {
                coreHomework10();
            } else if (numberOfHomework == 11) {
                coreHomework11();
            } else if (numberOfHomework == 12) {
                coreHomework12();
            } else if (numberOfHomework == 13) {
                coreHomework13();
            } else if (numberOfHomework == 14) {
                coreHomework14();
            } else if (numberOfHomework == 15) {
                coreHomework15();
            } else if (numberOfHomework == 16) {
                coreHomework16();
            } else if (numberOfHomework == 17) {
                coreHomework17();
            } else if (numberOfHomework == 19) {
                coreHomework19();
            } else if (numberOfHomework == 21) {
                coreHomework21();
            } else if (numberOfHomework == 99) {
                System.out.println("Выход");
            } else {
                System.out.println("Похоже что такое ДЗ я еще не сделал :(");
            }
        }
    }
}
