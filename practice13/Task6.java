import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task6 {

    // Прочитать весь файл как одну строку (UTF-8)
    public static String readFile(Path path) throws IOException {
        return Files.readString(path, StandardCharsets.UTF_8);
    }

    // Разбить текст на слова: буквы любых алфавитов + цифры
    public static List<String> splitToWords(String text) {
        // Разделяем по всему, что НЕ буква/цифра (поддерживает кириллицу)
        String[] tokens = text.split("[^\\p{L}\\p{Nd}]+");
        List<String> words = new ArrayList<>();
        for (String t : tokens) {
            if (!t.isBlank()) {
                words.add(t);
            }
        }
        return words;
    }

    // Сохранить слова построчно в файл (UTF-8)
    public static void saveWords(Path outPath, List<String> words) throws IOException {
        Files.write(outPath, words, StandardCharsets.UTF_8);
    }

    // Удобный метод: прочитать файл -> получить слова
    public static List<String> readWordsFromFile(Path path) throws IOException {
        String content = readFile(path);
        return splitToWords(content);
    }
}
