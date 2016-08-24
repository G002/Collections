package Collections;

import java.util.LinkedList;

/**
 * Created by geethakalluri on 8/23/16.
 */
public class LLDemo {
    public static void main(String [] args){
        LinkedList<String> lList = new LinkedList<>();

        lList.add("F");
        lList.add("B");
        lList.add("D");
        lList.add("E");
        lList.add("C");
        lList.addLast("Z");
        lList.addFirst("A");

        lList.add(1,"A2");

        System.out.println("Original Contents of linked List"+ lList);
        lList.remove("F");
        lList.remove(2);

        System.out.println("Contents of Linked List after Deletion"+ lList);

        lList.removeFirst();
        lList.removeLast();
        System.out.println("Contents of Linked List after Deleting first and last"+ lList);

        //Get and Set Values

        String val= lList.get(2);
        lList.set(2, val+"changed");

        System.out.println("Contents of Linked List after changing the List"+lList);



    }
}
