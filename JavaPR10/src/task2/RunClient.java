package task2;

public class RunClient {
    public static void main(String[] args) {
        Client cl = new Client();
        ChairFactory cf = new ChairFactory();

        cl.setChair(cf.createVictorianChair());
        cl.sit();

        cl.setChair(cf.createMagicChair());
        cl.sit();

        cl.setChair(cf.createFunctionalChair());
        cl.sit();
    }
}
