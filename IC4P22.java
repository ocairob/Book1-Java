import java.util.Scanner;
public class IC4P22 {
    public static void main(String[] args){        
        int mcm, num1, num2, num; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the first whole number: ");
        num1 = lee.nextInt();
        System.out.print("Please enter the second whole number: ");
        num2 = lee.nextInt();
        if (num1 >= num2){
            mcm = num1 * 2;
            num = num1;
        } 
        else {
            mcm = num2 * 2;
            num = num2;
        }
        while((mcm % num1 != 0) || (mcm % num2 != 0))
             mcm += num;
        System.out.println("\nThe minimum common multiple is: " + mcm);       
    }
}

