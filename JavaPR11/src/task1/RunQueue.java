package task1;

public class RunQueue {
    public static void main(String[] args) {
        ArrayQueueModule<Integer> aqm = new ArrayQueueModule<>(5);
        ArrayQueueADT<Integer> aqADT = new ArrayQueueADT<>(5);
        ArrayQueue<Integer> aq = new ArrayQueue<>(5);

        System.out.println("enqueue method test...");
        for(int i = 1; i < 11; i++) {
            aqm.enqueue(i);
            aqADT.enqueue(i);
            aq.enqueue(i);
        }

        System.out.print("ArrayQueueModule = ");
        System.out.println(aqm);
        System.out.print("ArrayQueueADT = ");
        System.out.println(aqADT);
        System.out.print("ArrayQueue = ");
        System.out.println(aq + "\n");

        System.out.println("element method test...");
        System.out.println("ArrayQueueModule = " + aqm.element());
        System.out.println("ArrayQueueADT = " + aqADT.element());
        System.out.println("ArrayQueue = " + aq.element() + "\n");

        System.out.println("dequeue method test...");
        System.out.println("ArrayQueueModule = " + aqm.dequeue());
        System.out.println("ArrayQueueADT = " + aqADT.dequeue());
        System.out.println("ArrayQueue = " + aq.dequeue() + "\n");

        System.out.println("printing queues...");
        System.out.print("ArrayQueueModule = ");
        System.out.println(aqm);
        System.out.print("ArrayQueueADT = ");
        System.out.println(aqADT);
        System.out.print("ArrayQueue = ");
        System.out.println(aq + "\n");

        System.out.println("size method test...");
        System.out.println("ArrayQueueModule = " + aqm.size());
        System.out.println("ArrayQueueADT = " + aqADT.size());
        System.out.println("ArrayQueue = " + aq.size() + "\n");

        System.out.println("clear method test... " + "\n");
        aqm.clear();
        aqADT.clear();
        aq.clear();

        System.out.println("isEmpty method test...");
        System.out.println("ArrayQueueModule = " + aqm.isEmpty());
        System.out.println("ArrayQueueADT = " + aqADT.isEmpty());
        System.out.println("ArrayQueue = " + aq.isEmpty() + "\n");

        System.out.println("size method test...");
        System.out.println("ArrayQueueModule = " + aqm.size());
        System.out.println("ArrayQueueADT = " + aqADT.size());
        System.out.println("ArrayQueue = " + aq.size() + "\n");
    }
}
