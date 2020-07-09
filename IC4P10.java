import java.util.Scanner;

public class IC4P10 {
    public static void main(String[] args){
        int number, digit, i;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the four-digit number: ");
        number  = lee.nextInt();
        for (i= 1; i <= 4; i++){
                digit = number % 10;
                number = number / 10;
                System.out.print(digit + "\t");
        }      
    }
}
