package main.java;

import java.util.Arrays;
/**
 * Класс Test
 * Явлется точкой запуска всех тестов в данном пакете
 * @author Badikov Dmitriy
 */
public class Test {
    public static void main(String[] args) {
        try {
            TestCompareObject testCompareObject = new TestCompareObject();
            testCompareObject.testCompareObjectRun();

            TestMap testMap = new TestMap();
            testMap.testMapRun();

            TestSort testSort = new TestSort();
            testSort.testSortRun();

        } catch (Exception e) {
            System.out.println("Ошибка " + e.getMessage() + ", исправьте входные параметры");
        }

    }
}
