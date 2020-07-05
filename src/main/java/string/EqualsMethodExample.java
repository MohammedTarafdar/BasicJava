package string;

import java.util.ArrayList;
import java.util.List;

public class EqualsMethodExample {


    public static void main(String[] args) {

        String str = "javaTpoint";
        String str1 = "javatpoint";
        String str2 = "JavaTPoint";
        String str3 = "javaTpoint";
        String str4 = "javaTpoint";


        if (str.equals(str1)){
            System.out.println("str and str1 are equals");
        }
        else if (str.equals(str2)){
            System.out.println("str and str2 are equals");
        }
        else if (str.equals(str3)){
            System.out.println("str and str3 are equals");
        }
        else if (str.equals(str4)){
            System.out.println("str and str4 are equals");
        }
        else {
            System.out.println("None of them are equals");
        }

        System.out.println("**************************************");

        String name = "Ali";

        List list = new ArrayList<String>();
        list.add("Mahbub");
        list.add("Raz");
        list.add("Ali");
        list.add("Kartick");
        list.add("Ashik");
        list.add("Hasan");
        list.add("Kazi");

        System.out.println(list);
        System.out.println(" ");


        for (Object st:list){
            if (st.equals(name)){
                System.out.println("The name "+name+" is present");
            }

        }


    }
}
