package task4;

public class Number {
    private String number;

    public Number(String unFormattedNumber) {
        if(unFormattedNumber.charAt(0) != '8') {
            number = unFormattedNumber.substring(0, unFormattedNumber.length() - 7) + "-" + unFormattedNumber.substring(unFormattedNumber.length() - 7, unFormattedNumber.length() - 4) + "-" + unFormattedNumber.substring(unFormattedNumber.length() - 4);
        }
        else {
            number = "+7" + unFormattedNumber.substring(1, unFormattedNumber.length() - 7) + "-" + unFormattedNumber.substring(unFormattedNumber.length() - 7, unFormattedNumber.length() - 4) + "-" + unFormattedNumber.substring(unFormattedNumber.length() - 4);
        }
    }

    @Override
    public String toString() {
        return "Formatted number = " + number;
    }
}
