package string;

public class ConcatMethodExample {

    public static void main (String[] args){

        String firstName = "Mohammed";

        System.out.println(firstName);

        String nfName = firstName.concat(" A. R.");

        System.out.println(nfName);

        String fName = nfName.concat(" Tarafdar");

        System.out.println(fName);



        String string = "Java";
        String string1 = "T";
        String string2 = "point";
        String string3 = " is good website";

        // Concatenating one string
        String st = string.concat(string1);
        System.out.println(st);

        // Concatenating multiple strings
        String st1 = string.concat(string1).concat(string2).concat(string3);
        System.out.println(st1);

    }

}
