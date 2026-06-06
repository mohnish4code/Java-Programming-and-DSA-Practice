import java.util.*;
public class conditions {
    public static void main(String[] args) {
        // Program for the age calculation
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if (age>18) {
        //     System.out.println("Adult");
        // }
        // else {
        //     System.out.println("Minor");
        // }

        // Program to check the odd or even number
        // int n = sc.nextInt();
        // if (n%2==0) {
        //     System.out.println("Number is even");
        // }
        // else {
        //     System.out.println("Number is odd");
        // }

        // else-if code
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a==b) {
            System.out.println("a and b are equal");
        }
        else if (a>b) {
            System.out.println("a is greater");
        }
        else {
            System.out.println("b is greater");
        }


    }
}