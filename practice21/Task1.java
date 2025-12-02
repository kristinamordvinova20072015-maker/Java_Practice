import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {

    // Универсальный обобщённый метод
    public static <T> List<T> convertArrayToList(T[] array) {
        return new ArrayList<>(Arrays.asList(array));
    }

    public static void main(String[] args) {

        // Пример: массив строк
        String[] arrStrings = {"one", "two", "three"};
        List<String> listStrings = convertArrayToList(arrStrings);
        System.out.println("Строки: " + listStrings);

        // Пример: массив чисел (Integer)
        Integer[] arrNumbers = {1, 2, 3, 4};
        List<Integer> listNumbers = convertArrayToList(arrNumbers);
        System.out.println("Числа: " + listNumbers);
    }
}

