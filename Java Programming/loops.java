import java.util.*;
public class loops {
    public static void main(String[] args) {
        for(int i=1; i<11; i++) {
            System.out.println(i);
        }

        // While loops in java
        int i = 1;
        while (i<11) {
            // System.out.println(i);
            i++;
        }

        // do while loops in java
        int i=1;
        do {
            System.out.println(i);
            i++;
        }
        while (i<11);

        // program for the sum of the first n natural numbers

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        // print the table of the number 
        System.out.println("Enter the number for table : ");
        int t = sc.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println(t*i);
        }
    }
}
