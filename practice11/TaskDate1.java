import java.util.Date;

public class TaskDate1 {
    public static void main(String[] args) {

        String developer = "Фамилия: ";

        String dateGiven = "Дата получения задания: 28.10.2025 18:00";

        Date dateSubmit = new Date(System.currentTimeMillis());

        System.out.println(developer);
        System.out.println(dateGiven);
        System.out.println("Дата сдачи задания: " + dateSubmit);
    }
}
