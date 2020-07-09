import java.util.Scanner;

public class IC4P6 {
    public static void main(String[] args){
        int i, n;
        double sum = 0;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        n = lee.nextInt();
        for (i= 1; i <= n; i++)
              sum += (double) 1 / i;
        System.out.printf("Serie result = %.2f", sum);
    }
}


