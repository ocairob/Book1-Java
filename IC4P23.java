import java.util.Scanner;

public class IC4P23 {
    public static void main(String[] args){
        double sumE = 0, expense; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the first expense: $");
        expense = lee.nextDouble();
        do{
              sumE += expense;
              System.out.print("Please enter the next expense: $");
              expense = lee.nextDouble();
        } while (expense != -1);
        System.out.print("\nTotal expenditures: $" + sumE);               
    }
}


