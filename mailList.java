package Collections;

import java.util.LinkedList;

/**
 * Created by geethakalluri on 8/24/16.
 */
public class mailList {

    public  static void main(String [] args){

        LinkedList<AddressUD> ml = new LinkedList<AddressUD>();

        ml.add(new AddressUD("J.W. West ", "11 Oak Ave", "Urbana","IL", "61801"));

        ml.add(new AddressUD("J.W. Thomas ", "1 Oak Ave", "Champaign","IL", "61820"));

        //Display the mail List

        for(AddressUD element : ml)
            System.out.println(element + "\n");

        System.out.println();
    }

}
