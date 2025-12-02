package practice23;

public abstract class AbstractQueue<E> implements Queue<E> {

    protected int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public abstract void enqueue(E element);

    @Override
    public abstract E dequeue();

    @Override
    public abstract E element();
}
