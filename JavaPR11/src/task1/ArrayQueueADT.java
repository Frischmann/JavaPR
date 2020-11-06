package task1;

public class ArrayQueueADT<E> implements QueueInterface<E> {
    private ArrayQueueModule<E> q = new ArrayQueueModule<>();

    public ArrayQueueADT(int size) {
        q.setSize(size);
    }

    @Override
    public void enqueue(E elem) {
        q.enqueue(elem);
    }

    @Override
    public E element() {
        return q.element();
    }

    @Override
    public E dequeue() {
        return q.dequeue();
    }

    @Override
    public int size() {
        return q.size();
    }

    @Override
    public boolean isEmpty() {
        return q.isEmpty();
    }

    @Override
    public void clear() {
        q.clear();
    }

    @Override
    public String toString() {
        return "" + q;
    }
}
