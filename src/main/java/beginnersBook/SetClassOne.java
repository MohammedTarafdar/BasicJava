package beginnersBook;

import java.util.HashSet;
import java.util.Iterator;

public class SetClassOne {
    /*
    Set is a collection that can not contain duplicate elements.
     */

    // Example of HashSet

    public static void main(String[] args) {

        HashSet <String> hashSet = new HashSet();

        hashSet.add("One");
        hashSet.add("Two");
        hashSet.add("Three");
        hashSet.add("Four");
        hashSet.add("Five");
        hashSet.add("Six");

        System.out.println("Print all elements of HashSet :" + hashSet);
        System.out.println("");

        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
