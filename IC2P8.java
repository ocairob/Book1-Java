import java.util.Scanner;

public class IC2P8 {
    public static void main(String[] args) {
        int i = 3, j = 5, k = 7, integerResult;
        double x = 3.5, y = 5.5, realResult;
        integerResult = ((j%k) /2) + 5;
        integerResult -= i;
        integerResult %= --k;
        System.out.println("\nFirst result: " + integerResult);
        realResult = ((double) (i%k)/2);
        realResult++;
        y *= ++x;
        System.out.println("\nSecond result: " + realResult);
        realResult -= --y;
        System.out.println("\nThird result: " + realResult);
      }
}

