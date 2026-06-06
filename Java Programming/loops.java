import java.util.*;
public class loops {
    public static void main(String[] args) {
        for(int m=1; m<11; m++) {
            System.out.println(m);
        }

        // While loops in java
        int i = 1;
        while (i<11) {
            System.out.println(i);
            i++;
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
            System.out.println(p*i);
        }
    }
}
