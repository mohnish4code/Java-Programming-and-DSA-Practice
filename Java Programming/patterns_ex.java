import java.util.*;
public class patterns_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        // To print the rhombus

        for(int i=1; i<=row; i++) {
            for(int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // To print the number pyramid

        for(int i=1; i<=row; i++) {
            for(int j=1; j<=row-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }
}
