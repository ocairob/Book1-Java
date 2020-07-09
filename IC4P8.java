import java.util.Scanner;

public class IC4P8 {
    public static void main(String[] args){
        int i, n, sum = 0;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        n = lee.nextInt();
        for (i= 1; i <= n; i++)
              sum += Math.pow(i, i); 
        System.out.println("Result = " + sum);
    }
}

