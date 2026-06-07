import java.util.*;
public class loops {
    public static void main(String[] args) {
        for(int m=1; m<11; m++) {
            System.out.println(m);
        }

        // While loops in java
        int r = 1;
        while (r<11) {
            System.out.println(r);
            r++;
        }

        // do while loops in java
        int k=1;
        do {
            System.out.println(k);
            k++;
        }
        while (k<11);

        // program for the sum of the first n natural numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int j=1; j<=n; j++) {
            sum = sum + j;
        }
        System.out.println(sum);

        // print the table of the number 
        System.out.println("Enter the number for table : ");
        int t = sc.nextInt();
        for(int p=1; p<=10; p++) {
            System.out.println(p*t);
        }

        // Print all the even numbers till n

        int m = 20;
        for (int q=1; q<=m; q++) {
            if (q%2==0) {
                System.out.println(q);
            }
        }

        // // do-while exercise 
        System.out.println("Enter the number either 1 or 0 : ");
        int u = sc.nextInt();

        do {
            int marks = sc.nextInt();
            if (marks >= 90) {
                System.out.println("This is good");
            }
            else if (marks <= 89 && marks >= 60) {
                System.out.println("This is also good");
            }
            else if (marks <= 59 && marks >= 0) {
                System.out.println("This is also good well");
            }
            else {
                System.out.println("Invalid input");
            }
        }
        while (u==0);

        // To print the prime number 

        int p = sc.nextInt();
        int c = 0;
        if (p==1) {
            System.out.println("Prime number");
        }
        else if (p<1) {
            System.out.println("Not prime");
        }
        else {
            for(int i=1; i<=p; i++) {
                if (p%i==0) {
                    c++;
                }
            }
        }

        if (c==2) {
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a prime number");
        }

    }
}
