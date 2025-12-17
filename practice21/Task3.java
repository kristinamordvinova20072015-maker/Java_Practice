package practice21;

public class Task3 {

    // Обобщённый метод, который возвращает элемент массива по индексу
    public static <T> T getElement(T[] array, int index) {

        // Проверяем, что индекс находится в пределах массива
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона: " + index);
        }

        // Возвращаем элемент массива
        return array[index];
    }

    public static void main(String[] args) {

        // Пример работы метода с массивом строк
        String[] words = {"Java", "Python", "C++"};
        System.out.println("Элемент: " + getElement(words, 1)); // Python

        // Пример работы метода с массивом чисел
        Integer[] numbers = {10, 20, 30, 40};
        System.out.println("Элемент: " + getElement(numbers, 2)); // 30
    }
}
