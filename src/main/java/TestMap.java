package main.java;
import java.util.HashMap;

/**
 * Класс TestMap
 * Явлется тестовым классом для класса Map
 * В данном классе тестируются все методы из класса Map
 * @author Badikov Dmitriy
 */

public class TestMap extends Map{
    public void testMapRun() {
        testCountElementsInMapRun("Ерохин", "Сергей");
        testDeleteValueFromMapRun("Tolya");
    }

    private void testCountElementsInMapRun(String lastName, String firstname) {
        System.out.println("///Тестирование класса Map///");
        System.out.println("______________________________________________________________");
        System.out.println("Тест метода: countElementsInMap()");
        System.out.println("Входные параметры: " + lastName + " " + firstname);
        System.out.println("Ожидаемый результат: 3" );
        System.out.println("Фактический результат: " + countElementsInMap(lastName, firstname));
        System.out.println("______________________________________________________________");

    }

    private void testDeleteValueFromMapRun(String value) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Sidorov", "Tolya");
        map.put("Петров", "Константин");
        map.put("Лисичкин", "Николай");
        map.put("Васечкин", "Алексей");

        System.out.println("Тест метода: deleteValueFromMap()");
        System.out.println("Входные параметры: " + map.toString());
        System.out.println("Удаление по значению: " + value);
        System.out.println("Ожидаемый результат: объект " + value + " удалён из списка");
        System.out.println("Фактический результат: " + deleteValueFromMap(map, value));
        System.out.println("______________________________________________________________");
        System.out.println("///Тестирование класса CompareObject завершенно///");
        System.out.println("______________________________________________________________");
    }



}
