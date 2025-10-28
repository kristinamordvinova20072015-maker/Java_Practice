public class Student {
    int iDNumber;
    String name;

    public Student(int iDNumber, String name) {
        this.iDNumber = iDNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + iDNumber + ", Name: " + name;
    }
}
