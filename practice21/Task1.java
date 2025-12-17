import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Класс Task1 демонстрирует использование обобщённого метода
 * для преобразования массива любого типа данных в список.
 */
public class Task1 {

    /**
     * Универсальный обобщённый метод convertArrayToList.
     * Принимает массив элементов типа T и возвращает список List<T>.
     *
     * @param array массив элементов произвольного ссылочного типа
     * @param <T>   параметр обобщённого типа
     * @return список, содержащий элементы переданного массива
     */
    public static <T> List<T> convertArrayToList(T[] array) {
        // Arrays.asList создаёт список на основе массива,
        // а ArrayList делает его изменяемым
        return new ArrayList<>(Arrays.asList(array));
    }

    /**
     * Точка входа в программу.
     * В методе main выполняется проверка работы метода
     * convertArrayToList на массивах строк и чисел.
     */
    public static void main(String[] args) {

        // Пример использования метода с массивом строк
        String[] arrStrings = {"one", "two", "three"};
        List<String> listStrings = convertArrayToList(arrStrings);
        System.out.printl

