package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDisplay {
    /*
    There are four way to display an array list
    1. For Loop
    2. Advance for loop
    3. While loop
    4. Iterator
     */

    public static void main(String[] args) {

        List aList = new ArrayList <String>();

        aList.add("Aber Yusuf");
        aList.add("Yusuf Ahmed");
        aList.add("Ashikur Rahman");
        aList.add("Abu Talha");
        aList.add("Sohel Ahmed");
        aList.add("Asad Ali");
        aList.add("Ashraf Ahmed");

        System.out.println("List of student is: "+aList);
        System.out.println("Size of ArrayList is: "+aList.size()+" elements");

        //Display your array list with for loop
        System.out.println(" ");
        System.out.println("Display your array list by using for loop");
        for (int count = 0; count < aList.size(); count ++){
            System.out.println(aList.get(count));
        }

        //Display your list with the help of Iterator
        System.out.println(" ");
        System.out.println("Display your list with the help of Iterator");

        Iterator iterator = aList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }

}
