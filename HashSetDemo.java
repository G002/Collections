package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by geethakalluri on 8/23/16.
 */
public class HashSetDemo {

    public static void main(String [] args){

        LinkedHashSet<String> hs = new LinkedHashSet<>();

        // Adding Elements to the HashSet

        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Epsilon");
        hs.add("Omega");

        System.out.println(hs);


    }
}
