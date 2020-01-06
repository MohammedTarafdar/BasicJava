package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

    /*
    LIST ==> List is an ordered based collection. Lists may contain duplicate elements. Elements can be inserted or
    accessed by their position in the list, using a zero-based index.
    ArrayList ==> ArrayList class implements List interface and it is based on an Array dara structure. It is widely
    used because of the functionality and flexibility it offers. ArrayList is a resizable array implementation of the
    List interface.
     */

    public static void main(String[] args) {

        ArrayList<String> aList = new ArrayList<String>();

        //.add(Object o) method use to add an object in The ArrayList at last position
        aList.add("Aber Yusuf");
        aList.add("Yusuf Ahmed");
        aList.add("Ashikur Rahman");
        aList.add("Abu Talha");
        aList.add("Sohel Ahmed");
        aList.add("Asad Ali");
        aList.add("Ashraf Ahmed");

        //Displaying element
        System.out.println("Shift student Name is :"+aList);
        //.size() method will give you the size of the ArrayList, i.e. how many elements it contains
        System.out.println("Size of ArrayList: Number of element is "+aList.size());

        //.add(int index, Object o) method use to add an object in the list at the given index

        aList.add(5,"Hema Ahmed");
        aList.add(6,"Steve");


        System.out.println("New student list of ArrayList is :"+aList);
        System.out.println("Size of ArrayList: Number of element is "+aList.size());

        //.remove(Object o) method use to remove the object from list

        aList.remove("Asad Ali");
        System.out.println("New list after remove one person :"+aList);
        System.out.println("Size of ArrayList: Number of element is "+aList.size());

        //.remove(int index) method use to remove an element from list as per given index
        aList.remove(3);
        System.out.println("New list after removing another person :"+aList);
        System.out.println("Size of ArrayList: Number of element is "+aList.size());

        //.set(int index, Object o) method used to update an element in your list
        aList.set(5,"Salauddin Ahmed");
        System.out.println("New list after removing another person :"+aList);
        System.out.println("Size of ArrayList: Number of element is "+aList.size());

        //.clear() method is use to removing all the elements of the list of one go







    }



}
