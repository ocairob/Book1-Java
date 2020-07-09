import java.util.Scanner;

public class IC4P29 {
    public static void main(String[] args){
        int i, j, n;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the value of n: ");
        n = lee.nextInt();
        for (i= 1; i <= n; i++){
              for (j= 1; j <= i; j++)
                    System.out.print(j + "\t");
              for (j= i - 1; j >= 1; j--)
                    System.out.print(j + "\t");
              System.out.println("");
        }
    }
}
