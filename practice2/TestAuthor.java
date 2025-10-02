package practice2.f;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Kristina", "kristina_mordvinova@example.com", 'F');

        System.out.println("Имя: " + author.getName());
        System.out.println("Email: " + author.getEmail());
        System.out.println("Пол: " + author.getGender());
    }
}
