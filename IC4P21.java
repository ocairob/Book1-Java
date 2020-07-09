import java.util.Scanner;

public class IC4P21 {
    public static void main(String[] args){
        int mcd = 1, num1, num2, divisor;
        boolean bol = true; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the first whole number: ");
        num1 = lee.nextInt();
        System.out.print("Please enter the second whole number: ");
        num2 = lee.nextInt();
        if (num1 >= num2)
               divisor = num2 / 2;
        else
               divisor = num1 / 2;
        while (divisor > 1 && bol){
               if((num1 % divisor == 0) && (num2 % divisor == 0)){
                         mcd = divisor;
                         bol = false;
               }
               divisor -= 1;
        }
        System.out.println("\nThe maximum common divisor is: " + mcd);       
    }
}
