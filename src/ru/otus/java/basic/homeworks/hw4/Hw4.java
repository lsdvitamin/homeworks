package ru.otus.java.basic.homeworks.hw4;

import java.util.Random;

import static ru.otus.java.basic.homeworks.Util.inputNumber;
import static ru.otus.java.basic.homeworks.Util.inputString;

/**
 * класс Домашняя работа 4
 *
 * @author Sergei on 05.05.2024.
 * @progect homeworks
 */

public class Hw4 {
    static Box box;
    static User[] users;

    /**
     * Обеспечивает выбор метода в ДЗ-4 и выход к выбору ДЗ
     */
    public static void coreHomework4() {
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
                    System.out.print("\nВведите действие \n1-вывести информацию о коробке\n2-Перекрасить коробку\n" +
                            "3-Положить предмет в коробку\n4-Выкинуть предмет из коробки" +
                            "\n5-открыть коробку\n6-Закрыть коробку  /0-к выбору метода/: ");
                    action = inputNumber();
                    if (action == 1) {
                        System.out.println();
                        box.printInfo();
                    } else if (action == 2) {
                        System.out.print("Введите цвет в который будем красить: ");
                        String newColor = inputString();
                        paintBox(newColor);
                    } else if (action == 3) {
                        if (getBoxIsFull()) {
                            System.out.println("\nКоробка занята. Выбросите оттуда " + box.getWhatIsInside());
                        } else {
                            if (box.getIsOpen()) {
                                System.out.print("Введите название предмета: ");
                                String objectName = inputString();
                                getPutSomethinпIntoBox(objectName);
                            } else {
                                System.out.println("\nНельзя положить что-то в закрытую коробку");
                            }
                        }
                    } else if (action == 4) {
                        getThrowObjectFromBox();
                    } else if (action == 5) {
                        changeStatusBox("open");
                    } else if (action == 6) {
                        changeStatusBox("close");
                    }
                }
            }
        }
    }

    /**
     * Выкидывает из коробки предмет
     */
    private static void getThrowObjectFromBox() {
        if (box.getIsOpen()) {
            if (box.getWhatIsInside().equals("")) {
                System.out.println("\n" + "коробка пуста, нечего выбрасывать");
            } else {
                System.out.println("\n" + box.getWhatIsInside() + " выброшен из коробки");
                box.setWhatIsInside("");
                box.setWeight(box.getWeight() - 10);
            }
        } else {
            System.out.println("\nВы не можете выбросить " + box.getWhatIsInside() + " пока коробка закрыта");
        }
    }

    /**
     * Красит коробку в другой цвет
     *
     * @param newColor новый цвет
     */
    private static void paintBox(String newColor) {
        box.setColor(newColor);
        box.setWeight(box.getWeight() + 1);
        System.out.println("\nПокрасил коробку в " + newColor);
    }


    /**
     * Кладет в коробку предмет если коробка пустая. Если Полная, то выводит сообщение об этом
     *
     * @param object Предмет, который хотим положить в коробку
     */
    private static void getPutSomethinпIntoBox(String object) {
        box.setWhatIsInside(object);
        box.setWeight(box.getWeight() + 10);
        System.out.println("\nПоложили в коробку " + box.getWhatIsInside());
    }


    /**
     * Проверяет, есть ли что то в коробке
     *
     * @return
     */
    private static boolean getBoxIsFull() {
        if (box.getWhatIsInside().isEmpty()) {
            return false;
        }
        return true;
    }

    /**
     * Меняет статус коробки. Если была открыта, то закрывает. И наоборот, если была закрыта, то открывает
     */
    private static void changeStatusBox(String action) {
        if (action.equals("close")) {
            if (box.getIsOpen()) {
                box.setIsOpen(false);
                System.out.println("\nВыполнено-коробка закрыта");
            } else {
                System.out.println("\nНе выполнено-коробка уже была закрыта");
            }
        } else {
            if (!box.getIsOpen()) {
                box.setIsOpen(true);
                System.out.println("\nВыполнено-коробка открыта");
            } else {
                System.out.println("\nНе выполнено-коробка уже была открыта");
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
                users[i].pringInfoAboutUser(users[i]);
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