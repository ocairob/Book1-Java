
import java.util.Scanner;

public class IC2P6 {
    public static void main(String[] args) {
        double radius, area, volumen;
        Scanner lee = new Scanner(System.in);
        System.out.print("\nPlease enter the radius of the sphere: ");
        radius = lee.nextDouble();
        area = 4 * Math.PI * Math.pow(radius,2);
        volumen = Math.PI * Math.pow(radius,3) / 3;
        System.out.printf("\nSphere area: %.2f", area);  
        System.out.printf("\nSphere volumen: %.2f",volumen);
      }
}


