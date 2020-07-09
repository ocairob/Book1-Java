
import java.util.Scanner;
public class IC2P3 {
    public static void main(String[] args) {
        double base, height, perimeter, area; 
        Scanner lee = new Scanner(System.in);
        System.out.println("Please enter the base of the rectangle: ");
        base = lee.nextDouble();
        System.out.println("Please enter the height of the rectangle: ");
        height = lee.nextDouble();
        perimeter = 2*base + 2*height;
        area = base * height;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }  
}

