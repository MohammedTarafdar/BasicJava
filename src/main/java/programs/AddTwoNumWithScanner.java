package programs;

import java.util.Scanner;

public class AddTwoNumWithScanner {


    public static void main(String[] args) {


        int num1, num2, sum;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your First number: ");
        num1 = scan.nextInt();

        System.out.println("Enter your Second number: ");
        num2 = scan.nextInt();

        scan.close();
        sum = num1 + num2;
        System.out.println("Sum of your two numbers: "+sum);




    }
}
