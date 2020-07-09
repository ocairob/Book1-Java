import java.util.Scanner;

public class IC4P16 {
    public static void main(String[] args){
        int number;
        double square, cub; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        number = lee.nextInt();
        while (number != -1){
             square = Math.pow(number, 2);
             cub = Math.pow(number, 3);
             System.out.print("Number: " + number + " Square: " + square + 
                 " Cub: " + cub);
             System.out.print("\nPlease enter the number: ");
             number = lee.nextInt();   
        }
    }
}


