import java.util.Scanner;

public class IC3P10 {
      public static void main(String[] args) {
            int integer;
            Scanner lee = new Scanner(System.in);
            System.out.print("Please enter the integer number: ");
            integer = lee.nextInt();
            if (integer % 2 == 0)
                 System.out.println("\nEven");
            else
                 System.out.println("\nOdd");
    }
}
