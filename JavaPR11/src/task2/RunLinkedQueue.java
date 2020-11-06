package task2;

public class RunLinkedQueue {
    public static void main(String[] args) {
        LinkedQueue<Integer> lc = new LinkedQueue<>();

        System.out.println("enqueue method test...");
        for(int i = 1; i < 11; i++)
            lc.enqueue(i);

        System.out.print("LinkedQueue = ");
        System.out.println(lc + "\n");

        System.out.println("element method test...");
        System.out.println("ArrayQueue = " + lc.element() + "\n");

        System.out.println("dequeue method test...");
        System.out.println("ArrayQueue = " + lc.dequeue() + "\n");

        System.out.println("printing queue...");
        System.out.print("ArrayQueue = ");
        System.out.println(lc + "\n");

        System.out.println("size method test...");
        System.out.println("ArrayQueue = " + lc.size() + "\n");

        System.out.println("clear method test... " + "\n");
        lc.clear();

        System.out.println("isEmpty method test...");
        System.out.println("ArrayQueue = " + lc.isEmpty() + "\n");

        System.out.println("size method test...");
        System.out.println("ArrayQueue = " + lc.size() + "\n");
    }
}
