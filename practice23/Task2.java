package practice23;

public class Task2 {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedQueue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Первый элемент: " + queue.element()); // 10
        System.out.println("Удалили: " + queue.dequeue());         // 10
        System.out.println("Размер: " + queue.size());             // 2

        queue.clear();
        System.out.println("Пустая? " + queue.isEmpty());          // true
    }
}
