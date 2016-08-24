package Collections;

/**
 * Created by geethakalluri on 8/24/16.
 */
public class AddressUD {


    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    AddressUD(String n, String s, String c,
              String st, String cd) {
        name = n;
        street = s;
        city = c;
        state = st;
        code = cd;
    }


    public String toString() {

        return name + "\n" + street + "\n" +
                city + "\n" + state + " " + code;
    }

}

