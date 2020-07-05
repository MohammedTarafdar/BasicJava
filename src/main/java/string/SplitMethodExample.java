package string;

public class SplitMethodExample {

    public static void main(String[] args) {

        String statement = "Java is an object oriented programming language";

        String[] words = statement.split("\\s");

        // Java String split() method example
        for (String w:words){
            System.out.println(w);
        }
        System.out.println(" ");

        //Java String split() method with regex and length example

        System.out.println("Return words :");
        String[] words1 = statement.split("\\s",2);
        for (String w1:words1){
            System.out.println(w1);
        }

        System.out.println(" ");
        System.out.println("Return words :");
        String[] words2 = statement.split("\\s",5);
        for (String w2:words2){
            System.out.println(w2);
        }
    }

}
