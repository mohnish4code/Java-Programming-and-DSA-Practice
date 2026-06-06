import java.util.*;
public class conditions {
    public static void main(String[] args) {
        // Program for the age calculation
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age>18) {
            System.out.println("Adult");
        }
        else {
            System.out.println("Minor");
        }

        // Program to check the odd or even number
        int n = sc.nextInt();
        if (n%2==0) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }

        // else-if code
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x==y) {
            System.out.println("a and b are equal");
        }
        else if (x>y) {
            System.out.println("a is greater");
        }
        else {
            System.out.println("b is greater");
        }

        // Calculator code in java 
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the operation you wanna perform : ");
        int calc = sc.nextInt();

        switch (calc) {
            case 1: System.out.println(a+b);
            break;
            
            case 2: System.out.println(a-b);
            break;

            case 3: System.out.println(a*b);
            break;

            case 4: System.out.println(a/b);
            break;

            case 5: System.out.println(a%b);
            break;
            
            default: System.out.println("No options Available");
            break;
        }
    }
}