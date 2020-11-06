package task2;

public class AddressFirstMethod {
    private String country, region, city, street, house, housing, apartment;

    public AddressFirstMethod(String fullAddress) {
        String[] info = fullAddress.split(", ");

        country = info[0];
        region = info[1];
        city = info[2];
        street = info[3];
        house = info[4];
        housing = info[5];
        apartment = info[6];
    }

    @Override
    public String toString() {
        return "AddressFirstMethod{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", housing='" + housing + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
