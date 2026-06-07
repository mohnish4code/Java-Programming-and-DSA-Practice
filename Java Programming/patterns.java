import java.util.Scanner;

public class patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        // int col = sc.nextInt();

        // Print the rectangle or square pattern
        // for (int i=1; i<=row; i++) {
        //     for (int j=1; j<=col; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // To print the hollow rectangle
        // for (int i=1; i<=row; i++) {
        //     for (int j=1; j<=col; j++) {
        //         if (i==1 || j==1 || i==row || j==col) {
        //             System.out.print("*");
        //         }
        //         else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // To print the half pyramid
        // for(int i=1; i<=row; i++) {
        //     for (int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }

        // To print the inverted half pyramid
        // for(int i=row; i>=1; i--) {
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }

        // To print the right angled pyramid
        // for(int i=1; i<=row; i++) {
        //     for(int j=1; j<=row-i; j++) {
        //         System.out.print(" ");
        //     }

        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // To print the numbers in right angled format
        for(int i=1; i<=row; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
