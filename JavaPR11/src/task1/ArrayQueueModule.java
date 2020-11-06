package task1;

import java.util.ArrayList;

public class ArrayQueueModule<E> implements QueueInterface<E> {
    private ArrayList<E> arr = new ArrayList<>();
    private int size, front, rear;

    public ArrayQueueModule(int size) {
        this.size = size;
        this.front = this.rear = -1;
    }

    protected ArrayQueueModule() {
        this.front = this.rear = -1;
    }

    protected void setSize(int size) {
        this.size = size;
    }

    @Override
    public void enqueue(E elem) {
        if((front == 0 && rear == size - 1) || (rear == (front - 1) % (size - 1)))
        {
            return;
        }

        else if(front == -1)
        {
            front = 0;
            rear = 0;
            arr.add(rear, elem);
        }

        else if(rear == size - 1 && front != 0)
        {
            rear = 0;
            arr.set(rear, elem);
        }

        else
        {
            rear = (rear + 1);

            if(front <= rear)
            {
                arr.add(rear, elem);
            }

            else
            {
                arr.set(rear, elem);
            }
        }
    }

    @Override
    public E element() {
        if(isEmpty())
            return null;

        return arr.get(front);
    }

    @Override
    public E dequeue() {
        E temp;

        if(front == -1)
            return null;

        temp = arr.get(front);

        if(front == rear)
        {
            front = -1;
            rear = -1;
        }

        else if(front == size - 1)
        {
            front = 0;
        }
        else
        {
            front = front + 1;
        }

        return temp;
    }

    @Override
    public int size() {
        if (front > rear)
            return size - front + rear;
        else
            return rear - front;
    }

    @Override
    public boolean isEmpty() {
        return front == -1;
    }

    @Override
    public void clear() {
        front = rear = -1;
        arr.clear();
    }

    @Override
    public String toString() {
        if(front == -1)
        {
            System.out.print("Queue is Empty");
            return "";
        }

        if(rear >= front)
        {
            for(int i = front; i <= rear; i++)
            {
                System.out.print(arr.get(i));
                System.out.print(" ");
            }
        }

        else
        {
            for(int i = front; i < size; i++)
            {
                System.out.print(arr.get(i));
                System.out.print(" ");
            }

            for(int i = 0; i <= rear; i++)
            {
                System.out.print(arr.get(i));
                System.out.print(" ");
            }
        }
        return "";
    }
}
