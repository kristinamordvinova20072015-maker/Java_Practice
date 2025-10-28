package practice8;
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // колво чисел
        printSequence(n, 1, 0);
    }

    public static void printSequence(int n, int num, int printed) {
        if (n == 0) return;

        System.out.print(num + " ");

        if (printed + 1 == num) {
            printSequence(n - 1, num + 1, 0);
        } else {
            printSequence(n - 1, num, printed + 1);
        }
    }
}
