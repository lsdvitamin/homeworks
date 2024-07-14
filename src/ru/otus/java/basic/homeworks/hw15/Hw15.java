package ru.otus.java.basic.homeworks.hw15;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sergei on 26.05.2024 9:38.
 * @progect homeworks
 */
public class Hw15 {
    public static void coreHomework15() {
        List<Integer> arrayList = new ArrayList<>();
        List<String> arrayListStr = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        arrayList = creatreArrayList(1, 10);
        System.out.println(arrayList);
        System.out.println("Сумма элементов: " + calcSumElementsOfArrayList(arrayList));
        rewriteElementsOfArrayList(0, arrayList);
        System.out.println(arrayList);
        plusElementsOfArrayList(10, arrayList);
        System.out.println(arrayList);
        employees.add(new Employee("Petya", 20));
        employees.add(new Employee("Vasya", 23));
        employees.add(new Employee("Olya", 30));
        employees.add(new Employee("Victoria", 14));
        employees.add(new Employee("Ilia", 70));
        arrayListStr = createListOfName(employees);
        System.out.println(arrayListStr);
        arrayListStr = searchEmplyeesOlderThan(employees, 30);
        System.out.println(arrayListStr);
        System.out.println(checkAverageAge(employees, 35));
        System.out.println("Самый молодой сотрудник: " + getYoungerEmploee(employees).getNAME());
    }

    /**
     * Заполняет arrayList значениями от min до max с шагом 1
     *
     * @param min Минимальное значение
     * @param max Максимальное значение
     * @return Возвращает arrayList
     */
    public static List<Integer> creatreArrayList(int min, int max) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }

    /**
     * Складывает элементы ArrayList, которые больше пяти. Возвращает сумму.
     *
     * @param arrayList Список целых значений
     * @return сумма элементов
     */
    public static int calcSumElementsOfArrayList(List<Integer> arrayList) {
        int sum = 0;
        for (Integer element : arrayList) {
            if (element > 5) {
                sum += element;
            }
        }
        return sum;
    }

    /**
     * Перезаписывает все элементы списка числом number
     *
     * @param number    Число, которым перезаписываются все элементы списка
     * @param arrayList Список arrayList
     */
    public static void rewriteElementsOfArrayList(int number, List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, number);
        }
    }

    /**
     * Увеличивает каждый элемент списка на число number
     *
     * @param number    Число, на которое увеличиваются все элементы списка
     * @param arrayList Список arrayList
     */
    public static void plusElementsOfArrayList(int number, List<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, arrayList.get(i) + number);
        }
    }


    /**
     * Сщздает список имен из списка employees
     *
     * @param employees Список экземпляров работников
     * @return
     */
    public static List<String> createListOfName(List<Employee> employees) {
        List<String> listNames = new ArrayList<>();
        for (Employee employee : employees) {
            listNames.add(employee.getNAME());
        }

        return listNames;
    }

    /**
     * Формирует список сотрудников старше age
     *
     * @param employees Список сотрудников
     * @param age       Возраст, с которого сотрудник попадет в результирующий список
     * @return
     */
    public static List<String> searchEmplyeesOlderThan(List<Employee> employees, Integer age) {
        List<String> listNames = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getAGE() >= age) {
                listNames.add(employee.getNAME());
            }
        }
        return listNames;
    }

    /**
     * Проверяет, больше ли средний возраст всех сотрудников чем аргумент arg. Если больше, то true
     *
     * @param employees
     * @param arg
     * @return
     */
    public static boolean checkAverageAge(List<Employee> employees, Integer arg) {
        int sumAges = 0;
        for (Employee employee : employees) {
            sumAges += employee.getAGE();
        }
        return sumAges / (double) employees.size() > arg;

    }

    /**
     * Ищет самого молодого сторудника из списка и возвращает этот экземпляр
     *
     * @param employees Список сотрудников
     * @return Экземпляр самого молодого сотрудника
     */
    public static Employee getYoungerEmploee(List<Employee> employees) {
        int minAge = employees.get(0).getAGE();
        Employee emploeeRes = null;
        for (Employee employee : employees) {
            if (employee.getAGE() < minAge) {
                minAge = employee.getAGE();
                emploeeRes = employee;
            }
        }
        return emploeeRes;
    }

}