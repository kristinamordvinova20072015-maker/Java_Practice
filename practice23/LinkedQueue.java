package practice23;

public class LinkedQueue<E> extends AbstractQueue<E> {

    private static class Node<E> {
        E value;
        Node<E> next;

        Node(E value) {
            this.value = value;
        }
    }

    private Node<E> head; // первый элемент
    private Node<E> tail; // последний элемент

    @Override
    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element);

        if (tail == null) {        // очередь пустая
            head = tail = newNode;
        } else {
            tail.next = newNode;   // прикрепляем в конец
            tail = newNode;
        }

        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) return null;

        E value = head.value;
        head = head.next;

        if (head == null) {
            tail = null;           // если удалён последний элемент
        }

        size--;
        return value;
    }

    @Override
    public E element() {
        return (isEmpty()) ? null : head.value;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }
}
