package Collections;

import java.util.ArrayList;

/**
 * Created by geethakalluri on 8/23/16.
 */
public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<String> al = new ArrayList<>();

        System.out.println("Initial size of Array List"+ al.size());

        al.add("C");
        al.add("a");
        al.add("n");
        al.add("d");
        al.add("y");

        al.add(1, "A2");

        System.out.println(" size of Array List After additions"+ al.size());
        System.out.println("Conternts of al:"+ al );

        al.remove("y");
        al.remove(2);

        System.out.println("Size of al after Deletions" + al.size());
        System.out.println("Contents of Array List "+ al);


    }
}
