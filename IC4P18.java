import java.util.Scanner;

public class IC4P18 {
    public static void main(String[] args){
        int n; 
        Scanner lee = new Scanner(System.in);
        System.out.print("please enter the value of n: ");
        n  = lee.nextInt();
        while ( n != 1){
              System.out.print(n + "\t");
              if ( Math.pow(-1, n) > 0)
                    n = n / 2;
              else
                    n = n * 3 + 1;
        }
        System.out.print(n + "\t");
    }
}


