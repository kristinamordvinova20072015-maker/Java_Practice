public class Main {

    public static void insertionSort(Student[] students) {
        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].iDNumber > key.iDNumber) {
                students[j + 1] = students[j];
                j--;
            }

            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(3, "Иван"),
                new Student(1, "Анна"),
                new Student(4, "Кристина"),
                new Student(2, "Даниил"),
        };

        System.out.println("До сортировки:");
        for (Student s : students) System.out.println(s);

        insertionSort(students);

        System.out.println("\nПосле сортировки:");
        for (Student s : students) System.out.println(s);
    }
}
