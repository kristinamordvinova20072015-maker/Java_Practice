import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер телефона: ");
        String input = scanner.nextLine();

        try {
            Task5 formatted = new Task5(input);
            System.out.println("Результат форматирования: " + formatted);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
