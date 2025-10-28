import java.io.IOException;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите путь к входному файлу (например, input.txt): ");
        String filePath = sc.nextLine().trim();
        if (filePath.isEmpty()) {
            System.out.println("Путь не указан. Завершение.");
            return;
        }

        try {
            List<String> words = Task6.readWordsFromFile(Path.of(filePath));

            // вариант 1: просто вывод по словам в исходном порядке
            System.out.println("\nСлова из файла (по одному в строке):");
            for (String w : words) {
                System.out.println(w);
            }

            // вариант 2 (дополнительно): отсортированный вывод (раскомментируй при необходимости)
            // List<String> sorted = new java.util.ArrayList<>(words);
            // Collections.sort(sorted, String.CASE_INSENSITIVE_ORDER);
            // System.out.println("\nСлова в алфавитном порядке:");
            // for (String w : sorted) {
            //     System.out.println(w);
            // }

            // сохраняем в words_out.txt рядом с проектом
            Path out = Path.of("words_out.txt");
            Task6.saveWords(out, words);
            System.out.println("\nГотово! Слова сохранены в файл: " + out.toAbsolutePath());

        } catch (IOException e) {
            System.out.println("Ошибка чтения/записи файла: " + e.getMessage());
        }
    }
}

