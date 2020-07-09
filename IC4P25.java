import java.util.Scanner;

public class IC4P25 {
    public static void main(String[] args){
        int i, j, n, sum;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        n = lee.nextInt();
        for (i= 1; i <= n; i++){
              sum = 0;
              for (j= 1; j <= (i / 2); j++)
                    if ((i % j) == 0)
                         sum += j;
              if (sum == i)
                    System.out.println("Perfect number: " + i);
        }
    }
}


