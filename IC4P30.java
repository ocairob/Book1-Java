import java.util.Scanner;

public class IC4P30 {
    public static void main(String[] args){
        int n, i, j, factorial;
        double sum = 0; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        n = lee.nextInt();
        for (i= 1; i <= n; i++){
            factorial = 1;
            for(j= 1; j<= i; j++)
                factorial *= j;
            sum += (Math.pow(i, 2) + 5 * i + 1) / factorial;
        }       
        System.out.print("\nSummation = " + sum); 
    }
}


