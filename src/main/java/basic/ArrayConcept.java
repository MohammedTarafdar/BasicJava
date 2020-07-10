package basic;

public class ArrayConcept {

    public static void main(String[] args) {


        ArrayConceptDemo aco = new ArrayConceptDemo();

        int [] newArray = new  int [10];


        newArray[0] = 10;
        newArray[1] = 15;
        newArray[2] = 20;


        for (int i=0; i<newArray.length; i++){
            System.out.println(newArray[i]);
        }
        System.out.println(" ");

        newArray[3] = 20;
        newArray[4] = 25;

        for (int j=0; j<10; j++){
            System.out.println(newArray[j]);
        }


        System.out.println(" ");
        aco.print();

    }




}


class ArrayConceptDemo{

    int [] array = {25, 20, 30, 10, 15};

    public void print(){
        for (int k=0; k<array.length; k++)
            System.out.println(array[k]);

    }

}
