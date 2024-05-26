package ru.otus.java.basic.homeworks.Hw9;

import java.util.ArrayList;

/**
 * @author Sergei on 26.05.2024 9:38.
 * @progect homeworks
 */
public class Hw9 {
    public static void coreHomework9() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> arrayListStr = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        arrayList = creatreArrayList(1, 10);
        System.out.println("Сумма элементов: " + calcSumElementsOfArrayList(arrayList));
        System.out.println("-------------------------------------");
        rewriteElementsOfArrayList(0, arrayList);
        printArrayListInt(arrayList);
        plusElementsOfArrayList(10, arrayList);
        printArrayListInt(arrayList);
        employees.add(new Employee("Petya", 20));
        employees.add(new Employee("Vasya", 23));
        employees.add(new Employee("Olya", 30));
        employees.add(new Employee("Victoria", 14));
        employees.add(new Employee("Ilia", 70));
        arrayListStr = createListOfName(employees);
        printArrayListStr(arrayListStr);
        arrayListStr = searchEmplyeesOlderThan(employees, 30);
        printArrayListStr(arrayListStr);
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
    public static ArrayList<Integer> creatreArrayList(int min, int max) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            System.out.println(i);
            arrayList.add(i);
        }
        System.out.println("-------------------------------------");
        return arrayList;
    }

    /**
     * Складывает элементы ArrayList, которые больше пяти. Возвращает сумму.
     *
     * @param arrayList Список целых значений
     * @return сумма элементов
     */
    public static int calcSumElementsOfArrayList(ArrayList<Integer> arrayList) {
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
    public static void rewriteElementsOfArrayList(int number, ArrayList<Integer> arrayList) {
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
    public static void plusElementsOfArrayList(int number, ArrayList<Integer> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, arrayList.get(i) + number);
        }
    }

    /**
     * Выводит элементы числового списка в консоль
     *
     * @param arrayList
     */
    public static void printArrayListInt(ArrayList<Integer> arrayList) {
        for (Integer element : arrayList) {
            System.out.println(element);
        }
        System.out.println("-------------------------------------");
    }

    /**
     * Выводит элементы строкового списка в консоль
     *
     * @param arrayList
     */
    public static void printArrayListStr(ArrayList<String> arrayList) {
        for (String element : arrayList) {
            System.out.println(element);
        }
        System.out.println("-------------------------------------");
    }


    /**
     * Сщздает список имен из списка employees
     *
     * @param employees Список экземпляров работников
     * @return
     */
    public static ArrayList<String> createListOfName(ArrayList<Employee> employees) {
        ArrayList<String> listNames = new ArrayList<>();
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
    public static ArrayList<String> searchEmplyeesOlderThan(ArrayList<Employee> employees, Integer age) {
        ArrayList<String> listNames = new ArrayList<>();
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
    public static boolean checkAverageAge(ArrayList<Employee> employees, Integer arg) {
        int sumAges = 0;
        double averageAge = 0.0;
        for (Employee employee : employees) {
            sumAges += employee.getAGE();
        }
        averageAge = sumAges / (double) employees.size();
        if (averageAge > arg) {
            return true;
        }
        return false;
    }

    /**
     * Ищет самого молодого сторудника из списка и возвращает этот экземпляр
     * @param employees Список сотрудников
     * @return Экземпляр самого молодого сотрудника
     */
    public static Employee getYoungerEmploee(ArrayList<Employee> employees) {
        int minAge = 1000;
        Employee emploeeRes = null;
        for (Employee employee : employees) {
            if (employee.getAGE() < minAge){
                minAge = employee.getAGE();
                emploeeRes = employee;
            }
        }
        System.out.println("-------------------------------------");
        return emploeeRes;
    }

}