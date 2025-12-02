package practice23;

public interface Queue<E> {

    /**
     * Добавляет элемент в конец очереди.
     * @param element – добавляемый элемент
     */
    void enqueue(E element);

    /**
     * Удаляет и возвращает первый элемент очереди.
     * @return элемент или null, если очередь пуста
     */
    E dequeue();

    /**
     * Просто возвращает первый элемент (не удаляя).
     * @return головной элемент или null, если очередь пуста
     */
    E element();

    /**
     * @return количество элементов в очереди
     */
    int size();

    /**
     * @return true, если очередь пуста
     */
    boolean isEmpty();

    /**
     * Удаляет все элементы очереди
     */
    void clear();
}

