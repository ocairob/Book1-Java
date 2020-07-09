import java.util.Scanner;

public class IC2P9 {
    public static void main(String[] args) {
        double ha, yard2, rod2, acre, homestead, mile2;
        Scanner lee = new Scanner(System.in);
        System.out.print("\nPlease enter the ha number of the ranch: ");
        ha = lee.nextDouble();
        yard2 = ha * 10000 / 0.83612736;
        rod2 = yard2 / 30.25;
        acre = rod2 / 160;
        homestead = acre / 160;
        mile2 = homestead / 4;
        System.out.println("\nThe ranch has: \n");
        System.out.printf("%.2f square yards \n", yard2);
        System.out.printf("%.2f square rods \n", rod2);
        System.out.printf("%.2f acres \n", acre);
        System.out.printf("%.2f homesteads \n" , homestead);
        System.out.printf("%.2f square miles \n", mile2);
    }


