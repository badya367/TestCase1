package main.java;

import java.util.Arrays;
import java.util.Collections;


public class Sort {
    /**
     * Метод сортировки массива в убывающем порядке
     * @param arr - массив, который приходит на вход
     * @return отсортированный массив
     */


    public static Integer[] reverseSort(Integer[] arr) {

        Arrays.sort(arr , Collections.reverseOrder());

        return arr;
        // Создать массив, наполнить его числами в возрастающем порядке
        // Необходимо вернуть массив отсортированный в убывающем порядке
    }
}
