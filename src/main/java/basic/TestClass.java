package basic;

public class TestClass {

    String Teacher = "Ali";

    public static void main(String[] args) {

        String variable = "I am test class variable";

        TestClass testClass = new TestClass();
        System.out.println(testClass.Teacher);

        Hasan hasan = new Hasan();
        hasan.print();

        System.out.println(variable);


    }



    class Ashik{
        String variable = "I am variable from ashik class";



    }

}


class Hasan{
    String name ="My name is Hasan";

    public void print(){
        System.out.println(name);
    }
}

