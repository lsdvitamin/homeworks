package ru.otus.java.basic.homeworks.hw17;

/**
 * @author Sergei on 09.06.2024 11:22.
 * @project homeworks
 */
public class SortArr {
    Integer[] arr = new Integer[10];

    public SortArr(Integer[] arr) {
        this.arr = arr;
    }

    public Integer[] getArr() {
        return arr;
    }

    public void bubbleSort(Integer[] array) {
        Integer swap;
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j - 1] > array[j]) {
                    swap = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = swap;
                }
            }
        }
    }


    public void quickSort(Integer[] array, Integer since) {
        Integer min = array[since];
        Integer swap;
        Integer numOfElem = since;
        for (int i = since; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                numOfElem = i;
            }
        }
        if (since == array.length - 1) {
            return;
        }
        swap = array[since];
        array[since] = array[numOfElem];
        array[numOfElem] = swap;
        quickSort(array, since + 1);
    }

}
