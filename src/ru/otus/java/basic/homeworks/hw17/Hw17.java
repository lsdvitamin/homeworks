package ru.otus.java.basic.homeworks.hw17;

import java.util.Arrays;

/**
 * @author Sergei on 06.06.2024 15:23.
 * @progect homeworks
 */
public class Hw17 {

    /**
     * Обеспечивает выбор метода в ДЗ-17 и выход к выбору ДЗ
     */
    public static void coreHomework17() {
        System.out.println("----------------Домашнее задание #17-----------------");
        Person person1 = new Person("Ivan", Position.QA, 1L);
        Person person2 = new Person("Victor", Position.DRIVER, 2L);
        Person person3 = new Person("Elena", Position.SENIOR_MANAGER, 3L);
        PersonDataBase personDataBase = new PersonDataBase(person1);
        personDataBase.add(person2);
        personDataBase.add(person3);
        personDataBase.findById(3L).print();
        System.out.println("Is person2 manager: " + personDataBase.isManager(person2));
        System.out.println("Is person2 employee: " + personDataBase.isEmployee(person2));

        System.out.println();
        SortArr newSortBubble = new SortArr(new Integer[]{20, 15, 25, 14, 6, 7, 4, 8, 3, 5});
        Integer[] arr = newSortBubble.getArr();
        System.out.println(Arrays.toString(arr));
        newSortBubble.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println();
        SortArr newSortQuick = new SortArr(new Integer[]{31, 19, 0, 10, -45, 8, 4, 14, 100, 5});
        Integer[] arr1 = newSortQuick.getArr();
        System.out.println(Arrays.toString(arr1));
        newSortBubble.quickSort(arr1, 0);
        System.out.println(Arrays.toString(arr1));
    }
}