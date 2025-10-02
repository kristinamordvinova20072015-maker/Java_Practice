package practice3;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // проверка
        while (true) {
            System.out.print("Введите размер массива (натуральное число > 0): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n > 0) break;
            } else {
                scanner.next(); // очищаем неправильный ввод
            }
            System.out.println("Ошибка! Попробуйте снова.");
        }

        // сооздание массива из n случайных чисел [0; n]
        int[] array = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(n + 1); // [0; n]
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));

        //считаем кол-во четных
        int countEven = 0;
        for (int value : array) {
            if (value % 2 == 0) countEven++;
        }

        if (countEven == 0) {
            System.out.println("В массиве нет чётных элементов.");
        } else {
            int[] evenArray = new int[countEven];
            int index = 0;
            for (int value : array) {
                if (value % 2 == 0) {
                    evenArray[index++] = value;
                }
            }

            System.out.println("Массив из чётных элементов: " + Arrays.toString(evenArray));
        }

        scanner.close();
    }
}

