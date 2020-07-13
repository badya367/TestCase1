package main.java;
import java.util.Arrays;

/**
 * Класс TestSort
 * Явлется тестовым классом для класса Sort
 * В данном классе тестируются все методы из класса Sort
 * @author Badikov Dmitriy
 */

public class TestSort extends Sort{
    public void testSortRun () {
        testReverseSortRun();
    }

    private void testReverseSortRun () {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("///Тестирование класса Sort///");
        System.out.println("______________________________________________________________");
        System.out.println("Входные параметры: " + Arrays.toString(arr));
        System.out.println("Ожидаемый результат: [7, 6, 5, 4, 3, 2, 1]");
        System.out.println("Фактический Результат: " + Arrays.toString(reverseSort(arr)));
        System.out.println("______________________________________________________________");
        System.out.println("///Тестирование класса Sort завершенно///");
    }
}
