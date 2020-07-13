package main.java;

/**
 * Класс TestCompareObject
 * Явлется тестовым классом для класса CompareObject
 * В данном классе тестируются все методы из класса CompareObject
 * @author Badikov Dmitriy
 */

public class TestCompareObject extends CompareObjects{
    public void testCompareObjectRun () {
        testCompareRun();
        testCompareToStringRun();
        testCompareHashCodeRun();
    }
    Object object1 = 15;
    Object object2 = 15;
    private void testCompareRun () {

        System.out.println("///Тестирование класса CompareObject///");
        System.out.println("______________________________________________________________");
        System.out.println("positive-тест (compare)");
        System.out.println("Входные параметры: " + object1 + "," + object2);
        System.out.println("Ожидаемый результат: true");
        System.out.println("Фактический результат: " + compare(object1, object2));
        System.out.println("______________________________________________________________");

        object2 = 14;

        System.out.println("negative-тест (compare)");
        System.out.println("Входные параметры: " + object1 + "," + object2);
        System.out.println("Ожидаемый результат: false");
        System.out.println("Фактический результат: " + compare(object1, object2));
        System.out.println("______________________________________________________________");
    }

    private void testCompareToStringRun () {
        this.object2 = 15;
        System.out.println("positive-тест (compareToString)");
        System.out.println("Входные параметры: " + object1.toString() + "," + object2.toString());
        System.out.println("Ожидаемый результат: true");
        System.out.println("Фактический результат: " + compareToString(object1, object2));
        System.out.println("______________________________________________________________");

        object2 = 20;

        System.out.println("negative-тест (compareToString)");
        System.out.println("Входные параметры: " + object1.toString() + "," + object2.toString());
        System.out.println("Ожидаемый результат: false");
        System.out.println("Фактический результат: " + compareToString(object1, object2));
        System.out.println("______________________________________________________________");
    }

    private void testCompareHashCodeRun () {
        this.object2 = 15;
        System.out.println("positive-тест (compareHashCode)");
        System.out.println("Входные параметры: " + object1.hashCode() + "," + object2.hashCode());
        System.out.println("Ожидаемый результат: true");
        System.out.println("Фактический результат: " + compareHashCode(object1, object2));
        System.out.println("______________________________________________________________");


        object2 = "Word";

        System.out.println("negative-тест (compareHashCode)");
        System.out.println("Входные параметры: " + object1.hashCode() + "," + object2.hashCode());
        System.out.println("Ожидаемый результат: false");
        System.out.println("Фактический результат: " + compareHashCode(object1, object2));
        System.out.println("______________________________________________________________");
        System.out.println("///Тестирование класса CompareObject завершенно///");
        System.out.println("______________________________________________________________");
    }
}
