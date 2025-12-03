package practice23;

public class Task1 {
    public class ArrayQueueModule {
        private static final int DEFAULT_CAPACITY = 10;
        private static int[] items;
        private static int front;
        private static int rear;
        private static int size;
        private static int capacity;

        static {
            capacity = DEFAULT_CAPACITY;
            items = new int[capacity];
            front = 0;
            rear = 0;
            size = 0;
        }

        // Предусловие: очередь не переполнена
        // Постусловие: элемент добавлен в конец очереди, size увеличен на 1
        public static void enqueue(int element) {
            if (isFull()) {
                throw new IllegalStateException("Queue is full");
            }
            items[rear] = element;
            rear = (rear + 1) % capacity;
            size++;
        }

        // Предусловие: очередь не пуста
        // Постусловие: возвращает первый элемент без изменения очереди
        public static int element() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return items[front];
        }

        // Предусловие: очередь не пуста
        // Постусловие: первый элемент удален и возвращен, size уменьшен на 1
        public static int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            int element = items[front];
            front = (front + 1) % capacity;
            size--;
            return element;
        }

        // Постусловие: возвращает текущий размер очереди
        public static int size() {
            return size;
        }

        // Постусловие: возвращает true если очередь пуста, иначе false
        public static boolean isEmpty() {
            return size == 0;
        }

        // Постусловие: все элементы удалены, очередь сброшена в начальное состояние
        public static void clear() {
            front = 0;
            rear = 0;
            size = 0;
        }

        private static boolean isFull() {
            return size == capacity;
        }

        public String toString() {
            if (isEmpty()) {
                return "[]";
            }
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % capacity;
                sb.append(items[index]);
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static class ArrayQueueADT {
        private int[] items;
        private int front;
        private int rear;
        private int size;
        private int capacity;

        public ArrayQueueADT() {
            this(10);
        }

        public ArrayQueueADT(int capacity) {
            this.capacity = capacity;
            this.items = new int[capacity];
            this.front = 0;
            this.rear = 0;
            this.size = 0;
        }

        // Предусловие: очередь не переполнена
        // Постусловие: элемент добавлен в конец очереди, size увеличен на 1
        public static void enqueue(ArrayQueueADT queue, int element) {
            if (isFull(queue)) {
                throw new IllegalStateException("Queue is full");
            }
            queue.items[queue.rear] = element;
            queue.rear = (queue.rear + 1) % queue.capacity;
            queue.size++;
        }

        // Предусловие: очередь не пуста
        // Постусловие: возвращает первый элемент без изменения очереди
        public static int element(ArrayQueueADT queue) {
            if (isEmpty(queue)) {
                throw new IllegalStateException("Queue is empty");
            }
            return queue.items[queue.front];
        }

        // Предусловие: очередь не пуста
        // Постусловие: первый элемент удален и возвращен, size уменьшен на 1
        public static int dequeue(ArrayQueueADT queue) {
            if (isEmpty(queue)) {
                throw new IllegalStateException("Queue is empty");
            }
            int element = queue.items[queue.front];
            queue.front = (queue.front + 1) % queue.capacity;
            queue.size--;
            return element;
        }

        // Постусловие: возвращает текущий размер очереди
        public static int size(ArrayQueueADT queue) {
            return queue.size;
        }

        // Постусловие: возвращает true если очередь пуста, иначе false
        public static boolean isEmpty(ArrayQueueADT queue) {
            return queue.size == 0;
        }

        // Постусловие: все элементы удалены, очередь сброшена в начальное состояние
        public static void clear(ArrayQueueADT queue) {
            queue.front = 0;
            queue.rear = 0;
            queue.size = 0;
        }

        private static boolean isFull(ArrayQueueADT queue) {
            return queue.size == queue.capacity;
        }

        public static String toString(ArrayQueueADT queue) {
            if (isEmpty(queue)) {
                return "[]";
            }
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < queue.size; i++) {
                int index = (queue.front + i) % queue.capacity;
                sb.append(queue.items[index]);
                if (i < queue.size - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static class ArrayQueue {
        private int[] items;
        private int front;
        private int rear;
        private int size;
        private int capacity;

        public ArrayQueue() {
            this(10);
        }

        public ArrayQueue(int capacity) {
            this.capacity = capacity;
            this.items = new int[capacity];
            this.front = 0;
            this.rear = 0;
            this.size = 0;
        }

        // Предусловие: очередь не переполнена
        // Постусловие: элемент добавлен в конец очереди, size увеличен на 1
        public void enqueue(int element) {
            if (isFull()) {
                throw new IllegalStateException("Queue is full");
            }
            items[rear] = element;
            rear = (rear + 1) % capacity;
            size++;
        }

        // Предусловие: очередь не пуста
        // Постусловие: возвращает первый элемент без изменения очереди
        public int element() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return items[front];
        }

        // Предусловие: очередь не пуста
        // Постусловие: первый элемент удален и возвращен, size уменьшен на 1
        public int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            int element = items[front];
            front = (front + 1) % capacity;
            size--;
            return element;
        }

        // Постусловие: возвращает текущий размер очереди
        public int size() {
            return size;
        }

        // Постусловие: возвращает true если очередь пуста, иначе false
        public boolean isEmpty() {
            return size == 0;
        }

        // Постусловие: все элементы удалены, очередь сброшена в начальное состояние
        public void clear() {
            front = 0;
            rear = 0;
            size = 0;
        }

        private boolean isFull() {
            return size == capacity;
        }

        @Override
        public String toString() {
            if (isEmpty()) {
                return "[]";
            }
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < size; i++) {
                int index = (front + i) % capacity;
                sb.append(items[index]);
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }
}

