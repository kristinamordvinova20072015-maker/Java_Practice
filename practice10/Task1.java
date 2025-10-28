public class Task1 {
    int iDNumber;
    String name;
    double GPA;

    public Task1(int iDNumber, String name, double GPA) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "ID: " + iDNumber + ", Name: " + name + ", GPA: " + GPA;
    }
}

