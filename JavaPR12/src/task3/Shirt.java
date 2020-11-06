package task3;

public class Shirt {
    private String serialNumber, name, colour, size;

    public Shirt(String fullSpec) {
        String[] spec = fullSpec.split(",");

        serialNumber = spec[0];
        name = spec[1];
        colour = spec[2];
        size = spec[3];
    }

    @Override
    public String toString() {
        return "Рубашка " + name + "\nСерийный номер данной одежды " + serialNumber + "\nЦвет " + colour + "\nРазмер = " + size;
    }
}
