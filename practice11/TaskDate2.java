import java.util.Date;
import java.util.Scanner;

public class TaskDate2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите дату: ");
        long userTime = scanner.nextLong();

        Date userDate = new Date(userTime);
        Date currentDate = new Date();

        System.out.println("\nВведённая дата: " + userDate);
        System.out.println("Текущая дата системы: " + currentDate);

        if (userDate.before(currentDate)) {
            System.out.println("Введенная дата МЕНЬШЕ текущей.");
        } else if (userDate.after(currentDate)) {
            System.out.println("Введенная дата БОЛЬШЕ текущей.");
        } else {
            System.out.println("Даты равны.");
        }
    }
}
