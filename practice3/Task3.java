package practice3;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[4];

        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + random.nextInt(90); // [10;99]
        }

        System.out.print("Массив: ");
        for (int num : array) System.out.print(num + " ");
        System.out.println();

        boolean isIncreasing = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing)
            System.out.println("Массив является строго возрастающей последовательностью.");
        else
            System.out.println("Массив не является строго возрастающей последовательностью.");
    }
}

