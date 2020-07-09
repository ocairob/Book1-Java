
import java.util.Scanner;

public class IC3P12 {
    public static void main(String[] args){
        int k;
        double x, result;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the value of k: ");
        k = lee.nextInt();
        System.out.print("Please enter the value of x: ");
        x = lee.nextDouble();
        switch (k){
               case 1: result = x / 5; 
                     break;
               case 2: 
               case 3: result = Math.pow(x, 2);
                     break;
               case 4: result = Math.pow(x, 3) + 5;
                     break;
               default: result = Math.sqrt(x);
                     break;
        }
        System.out.printf("\nF(x) =  %.2f", result);           
     }
}

