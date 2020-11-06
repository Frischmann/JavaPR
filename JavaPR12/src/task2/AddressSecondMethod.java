package task2;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class AddressSecondMethod {
    private String country, region, city, street, house, housing, apartment;

    public AddressSecondMethod(String fullAddress) {
        ArrayList<String> info = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(fullAddress, ",.;-");
        while(st.hasMoreTokens())
            info.add(st.nextToken());

        country = info.get(0);
        region = info.get(1).substring(1);
        city = info.get(2).substring(1);
        street = info.get(3).substring(1);
        house = info.get(4).substring(1);
        housing = info.get(5).substring(1);
        apartment = info.get(6).substring(1);
    }

    @Override
    public String toString() {
        return "AddressSecondMethod{" +
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
