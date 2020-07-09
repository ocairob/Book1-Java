
import java.util.Scanner;

public class IC2P7 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, area;
        Scanner lee = new Scanner(System.in);
        System.out.println("\nPlease enter the coordinates of the first point: ");
        x1 = lee.nextDouble();
        y1 = lee.nextDouble();
        System.out.println("\nPlease enter the coordinates of the second point: ");
        x2 = lee.nextDouble();
        y2 = lee.nextDouble();
        System.out.println("\nPlease enter the coordinates of the third point: ");
        x3 = lee.nextDouble();
        y3 = lee.nextDouble();
        area = Math.abs(x1 * (y2-y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;     
        System.out.printf("\nSphere area %.2f", area);    
      }
}

