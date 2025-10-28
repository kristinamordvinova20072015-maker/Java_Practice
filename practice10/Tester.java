import java.util.Comparator;
import java.util.Scanner;

public class Tester implements Comparator<Task1> {

    Task1[] students;
    int size;

    public void setArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество студентов: ");
        size = scanner.nextInt();
        students = new Task1[size];

        for (int i = 0; i < size; i++) {
            System.out.println("\nСтудент " + (i + 1));

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Имя: ");
            String name = scanner.next();

            System.out.print("GPA (можно вводить 4.7 или 4,7): ");
            String input = scanner.next().replace(",", ".");  // работает и с точкой и с запятой
            double gpa = Double.parseDouble(input);

            students[i] = new Task1(id, name, gpa);
        }
    }

    @Override
    public int compare(Task1 s1, Task1 s2) {
        return Double.compare(s2.GPA, s1.GPA); // убывание
    }

    public void quicksort(Task1[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }
    }

    private int partition(Task1[] arr, int low, int high) {
        Task1 pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (compare(arr[j], pivot) < 0) {
                i++;
                Task1 temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Task1 temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public void outArray() {
        for (Task1 s : students) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        Tester sorting = new Tester();

        sorting.setArray();

        System.out.println("\nСписок до сортировки:");
        sorting.outArray();

        sorting.quicksort(sorting.students, 0, sorting.size - 1);

        System.out.println("\nСписок после сортировки по GPA (убывание):");
        sorting.outArray();
    }
}

