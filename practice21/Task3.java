package practice21;

public class Task3 {

    // Обобщённый метод для получения элемента по индексу
    public static <T> T getElement(T[] array, int index) {
        if (index < 0 || index >= array.length) {
            throw new IndexOutOfBoundsException("Индекс вне диапазона: " + index);
        }
        return array[index];
    }

    public static void main(String[] args) {

        // Пример: массив строк
        String[] words = {"Java", "Python", "C++"};
        System.out.println("Элемент: " + getElement(words, 1)); // Python

        // Пример: массив чисел
        Integer[] numbers = {10, 20, 30, 40};
        System.out.println("Элемент: " + getElement(numbers, 2)); // 30
    }
}
