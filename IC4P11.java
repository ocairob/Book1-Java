import java.util.Scanner;

public class IC4P11 {
    public static void main(String[] args){
        int number, digit, denominator = 1000, i;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the number of four digits: ");
        number  = lee.nextInt();
        for (i= 1; i <= 4; i++){
              digit = number / denominator;
              number = number - digit * denominator;
              denominator = denominator / 10;
              System.out.print(digit + "\t");
        }     
    }
}

