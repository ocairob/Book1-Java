import java.util.Scanner;

public class IC4P7 {
    public static void main(String[] args){
        int i, n, productOS = 1;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        n = lee.nextInt();
        for (i= 2; i <= n; i++)
               productOS *= i; 
        System.out.println("Product of a sequence = " + productOS);
    }
}


