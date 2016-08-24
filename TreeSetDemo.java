package Collections;

import java.util.TreeSet;

/**
 * Created by geethakalluri on 8/23/16.
 */
public class TreeSetDemo {
    public static void main(String [] args){
        TreeSet<String> ts = new TreeSet<>();

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("D");
        ts.add("F");

        System.out.println("Tree Set is "+ ts);

        System.out.println(ts.subSet("C", "F"));


    }
}
