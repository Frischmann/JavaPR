package task2;

class QNode<E> {
    E key;
    QNode<E> next;

    public QNode(E key)
    {
        this.key = key;
        this.next = null;
    }
}

public class LinkedQueue<E> implements QueueInterface<E> {
    private QNode<E> front, rear;

    public LinkedQueue() {
        this.front = this.rear = null;
    }

    @Override
    public void enqueue(E elem) {
        QNode<E> temp = new QNode<>(elem);

        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }

    @Override
    public E element() {
        return front.key;
    }

    @Override
    public E dequeue() {
        if (this.front == null)
            return null;

        QNode<E> temp = this.front;
        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;

        return temp.key;
    }

    @Override
    public int size() {
        if (isEmpty())
            return 0;

        int count = 0;
        QNode<E> temp = this.front;

        while(temp != this.rear) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public void clear() {
        this.front = this.rear = null;
    }

    @Override
    public String toString() {
        if (isEmpty())
            return "LinkedQueue are empty!";

        QNode<E> temp = this.front;
        while(temp != this.rear) {
            System.out.print(temp.key + " ");
            temp = temp.next;
        }
        return "";
    }
}
