import java.util.Scanner;

public class IC3P19 {
    public static void main(String[] args){
        int a, b, c;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the three integer numbers: ");
        a = lee.nextInt();
        b = lee.nextInt();
        c = lee.nextInt();
        if (a > b)
              if (a > c)
                    System.out.printf("\nThe greatest is a"); 
              else if (a == c)
                    System.out.printf ("\nThe greatest are a and c");
              else 
                    System.out.printf ("\nThe greatest is c");
        else if (a == b)
              if (a > c)
                    System.out.printf ("\nThe greatest are a and b");
              else if (a == c)
                    System.out.printf("\nThe greatest are a, b, and c");
              else
                    System.out.printf("\nThe greatest is c");
        else if (b > c)
              System.out.printf ("\nThe greatest is b");
        else if (b == c)
              System.out.printf ("\nThe greatest are b and c");
        else
              System.out.printf ("\nThe greatest is c");
    }
}
