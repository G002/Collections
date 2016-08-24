package Collections;

import java.util.*;
import java.util.Set;

/**
 * Created by geethakalluri on 8/24/16.
 */
public class TreeMapDemo {
    public static void main(String[] args) {


        TreeMap<String, Double> tm = new TreeMap<>();
        tm.put("John", new Double(3414.34));
        tm.put("Lisa", new Double(8779.123));
        tm.put("tommy", new Double(6789.34));
        tm.put("Cathy", new Double(93333.123));

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // Display the set

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        double balance = tm.get("tommy");
        tm.put("tommy", balance + 2000);
        System.out.println("tommys new balance:" + tm.get("tommy"));
    }
}



