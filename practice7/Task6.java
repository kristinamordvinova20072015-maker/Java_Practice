package practice7;

interface ProcessStrings {
    int countSymbols(String s);
    String reverse(String s);
    String upperCase (String s);
}
class StringProcessor implements ProcessStrings {
    @Override
    public int countSymbols(String s) {
        return s.length();
    }

    @Override
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    @Override
    public String upperCase(String s) {
        return s.toUpperCase();
    }
}
public class Task6 {
    public static void main(String[] args) {
        StringProcessor proc = new StringProcessor();
        String text = "student RTU MIREA";

        System.out.println("Строка:" + text);
        System.out.println("Количество симвлов:" + proc.countSymbols(text));
        System.out.println("Повернутая строка:" + proc.reverse(text));
        System.out.println("В верхнем регистре:" + proc.upperCase(text));
    }
}
