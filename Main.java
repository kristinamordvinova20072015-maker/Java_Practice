package practice6;

public class Main {
    public static void main(String[] args) {
        Nameable planet = new Planet("Юпитер");
        Nameable car = new Car("BMW X6");
        Nameable animal = new Animal("Кот");

        System.out.println("Планета: " + planet.getName());
        System.out.println("Машина: " + car.getName());
        System.out.println("Животное: " + animal.getName());
    }
}
