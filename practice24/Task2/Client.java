package practice24;

public class Client {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    public void sit(Chair chair) {
        System.out.println("\n" + name + " пытается сесть на стул...");
        System.out.println("Тип стула: " + chair.getType());
        chair.sitOn();
        System.out.println("Описание: " + chair.getDescription());
    }

    public String getName() {
        return name;
    }
}