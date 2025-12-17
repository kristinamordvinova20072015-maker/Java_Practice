package practice21;

import java.util.*;

/**
 * Класс ArrayConverter предназначен для преобразования массива
 * любого типа данных в список (List).
 * Используется механизм обобщений (generics),
 * что позволяет работать с разными типами данных.
 */
public class ArrayConverter {

    /**
     * Обобщённый метод convertArrayToList преобразует массив в список.
     *
     * @param array входной массив элементов типа T
     * @param <T>   параметр типа (любой ссылочный тип данных)
     * @return список List, содержащий элементы массива
     */
    public static <T> List<T> convertArrayToList(T[] array) {
        // Создаём пустой список типа ArrayList
        List<T> list = new ArrayList<>();

        // Перебираем элементы массива и добавляем их в список
        for (T element : array) {
            list.add(element);
        }

        // Возвращаем полученный список
        return list;
    }

    /**
     * Точка входа в программу.
     * В методе main выполняется тестирование метода convertArrayToList
     * на массивах строк и чисел.
     */
    public static void main(String[] args) {

        // Тестирование метода с массивом строк
        String[] stringArray = {"один", "два", "три"};
        List<String> stringList = convertArrayToList(stringArray);

        // Вывод исходного массива и полученного списка строк
        System.out.println("Массив строк: " + Arrays.toString(stringArray));
        System.out.println("Список строк: " + stringList);

        // Тестирование метода с массивом чисел
        Integer[] numberArray = {1, 2, 3, 4, 5};
        List<Integer> numberList = convertArrayToList(numberArray);

        // Вывод исходного массива и полученного списка чисел
        System.out.println("Массив чисел: " + Arrays.toString(numberArray));
        System.out.println("Список чисел: " + numberList);
    }
}
