import java.util.Scanner;

public class IC4P27 {
    public static void main(String[] args){
        int i, j, n;
        boolean bol; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        n = lee.nextInt();
        for (i= 2; i <= n; i++){
              j = 2;
              bol = true;
              while (j <= i / 2 && bol){
                    if(i % j == 0)
                         bol = false;
                    j++;
              }
              if(bol)
                    System.out.print("\nThe number " + i + " is prime");
        }
    }
}

