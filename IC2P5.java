import java.util.Scanner;

public class IC2P5 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, distance;
        Scanner lee = new Scanner(System.in);
        System.out.println("\nPlease enter the coordinates of the first point: ");
        x1 = lee.nextDouble();
        y1 = lee.nextDouble();
        System.out.println("\nPlease enter the coordinates of the second point: ");
        x2 = lee.nextDouble();
        y2 = lee.nextDouble();
        distance = Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1 - y2), 2));
        System.out.printf("\nThe distance is: %.2f", distance);      
      }
}

