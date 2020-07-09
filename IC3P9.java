import java.util.Scanner;

public class IC3P9 {
    public static void main(String[] args) {
        int n1, n2, n3, n4; 
        double result1, result2; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the four whole numbers: ");
        n1 = lee.nextInt();
        n2 = lee.nextInt();
        n3 = lee.nextInt();
        n4 = lee.nextInt();
        if (n4 != 0){
                result1 = Math.pow(n1 - n2, 3) / n4;
                result2 = Math.pow(n2 * n3, 5) / n4;
                System.out.printf("\nResult of the first expression: %.2f", result1);
                System.out.printf("\nResult of the second expression: %.2f", result2);
        }
        else 
              System.out.printf("\nn4 must be non-zero");
     }
}

