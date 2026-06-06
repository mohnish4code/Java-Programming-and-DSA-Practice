import java.util.*;
public class main {
    public static void main(String[] args) {
        // Area of the triangle
        int height = 14;
        int base = 8;
        double area = (0.5*base*height);
        System.out.println(area);
        
        // Sum calculation in which user entering the data 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
    }
}
