package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by geethakalluri on 8/24/16.
 */
public class IteratorDemo {
    public static void main(String [] args){
        ArrayList<String> al = new ArrayList<>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

        System.out.println("Original contents of al:");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()){
            String element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();

        //Modify using Iterator

        ListIterator<String > litr = al.listIterator();
        while (litr.hasNext()){
            String element = litr.next();
            litr.set(element + "+");
        }

        System.out.print("Modified contents of Al:");

        itr = al.iterator();
        while (itr.hasNext()) {
            String element = itr.next();
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println("Modified List Backwards ");
        while (litr.hasPrevious()){
            String element = litr.previous();
            System.out.println(element + " ");
        }
        System.out.println();
    }
}
