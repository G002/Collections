package Collections;

import java.util.*;

/**
 * Created by geethakalluri on 8/24/16.
 */
public class HashMapDemo {

    public static void main(String [] args){

        HashMap<String,Double> hm = new HashMap<>();

        hm.put("John", new Double(3414.34));
        hm.put("Lisa", new Double(8779.123));
        hm.put("tommy", new Double(6789.34));
        hm.put("Cathy", new Double(93333.123));

        Set<Map.Entry<String,Double>> set = hm.entrySet();

        // Display the set

        for (Map.Entry<String,Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();

        double balance = hm.get("tommy");
        hm.put("tommy",balance+2000);
        System.out.println("tommys new balance:" + hm.get("tommy"));
    }


}
