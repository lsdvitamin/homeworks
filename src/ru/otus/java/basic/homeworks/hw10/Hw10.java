package ru.otus.java.basic.homeworks.hw10;

import java.util.Random;

import static ru.otus.java.basic.homeworks.Util.inputNumber;

/**
 * класс Домашняя работа 4
 *
 * @author Sergei on 05.05.2024.
 * @progect homeworks
 */

public class Hw10 {
    static Box box;
    static User[] users;

    /**
     * Обеспечивает выбор метода в ДЗ-4 и выход к выбору ДЗ
     */
    public static void coreHomework10() {
        System.out.println("----------------Домашнее задание #4-----------------");
        int numberOfMethod = 1;
        while (numberOfMethod != 0) {
            System.out.print("\nВведите номер метода для ДЗ-4(1-2)  /0-к выбору ДЗ/: ");
            numberOfMethod = inputNumber();
            if (numberOfMethod == 1) {
                createUser(10);
                getPrintUsers(10, 40);
            } else if (numberOfMethod == 2) {
                box = new Box(40, 30, 20, 50, "красный", false, "спички");
                int action = -1;
                while (action != 0) {
                    System.out.print("\nвведите действие \n1-вывести информацию о коробке\n2-перекрасить коробку\n" +
                            "3-положить предмет в коробку\n4-выкинуть предмет из коробки" +
                            "\n5-открыть коробку\n6-закрыть коробку  /0-к выбору метода/: ");
                    action = inputNumber();
                    if (action == 1) {
                        System.out.println();
                        box.printInfo();
                    } else if (action == 2) {
                        box.paint();
                    } else if (action == 3) {
                        box.putSomething();
                    } else if (action == 4) {
                        box.throwOutObject();
                    } else if (action == 5) {
                        box.open();
                    } else if (action == 6) {
                        box.close();
                    }
                }
            }
        }
    }


    /**
     * Выводит в консоль пользователей старше older
     *
     * @param count количество пользователей, учавствующих в поиске
     * @param older возраст, начиная с которого пользователь будет выведен в консоль
     */
    private static void getPrintUsers(int count, int older) {
        for (int i = 0; i < count; i++) {
            if (users[i].getYearOfBirth() > older) {
                users[i].printInfoAboutUser();
                System.out.println();
            }
        }
    }

    /**
     * Создает и записывает пользователей в массив
     *
     * @param count количество, создаваемых пользователей
     */
    private static void createUser(int count) {
        users = new User[count];
        Random rnd = new Random();
        int year;
        for (int i = 0; i < users.length; i++) {
            year = rnd.nextInt(30, 50);
            users[i] = new User("Иванов" + i, "Иван", "Иванович", year, "ivanov" + i + "@gmail.com");
        }
    }

}