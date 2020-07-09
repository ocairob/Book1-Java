import java.util.Scanner;

public class IC4P12 {
    public static void main(String[] args){
        int number, newN = 0, tenT = 10000, digit, i;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the number of five digits: ");
        number  = lee.nextInt();
        for (i= 1; i <= 5; i++){
             digit = number % 10;
             number = number / 10;
             newN = newN + digit * tenT;
             tenT = tenT / 10;
        }
        System.out.print("\nNew number = "+ newN);
    }
}
