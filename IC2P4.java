
import java.util.Scanner;
public class IC2P4 {
      public static void main(String[] args) {
        double side1, side2, side3, sp, area;
        Scanner lee = new Scanner(System.in);
        System.out.printf("\nEnter the first side of the triangle: ");
        side1 = lee.nextDouble();
        System.out.printf("\nEnter the second side of the triangle: ");
        side2 = lee.nextDouble();
        System.out.printf("\nEnter the third side of the triangle: ");
        side3 = lee.nextDouble();
        sp = (side1 + side2 + side3)/2;
        area = Math.sqrt(sp * (sp-side1) * (sp-side2) * (sp-side3));
        //The function Math.sqrt() is used to calculate the square root
        System.out.printf("\nThe area of the triangle is:  %.2f%n", area);     
        //We write the area with two decimal points
    }
}

