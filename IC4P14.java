import java.util.Scanner;

public class IC4P14 {
    public static void main(String[] args){
          double expense, sumE = 0;
          Scanner lee = new Scanner(System.in);
          System.out.print("Please enter the expense: $");
          expense = lee.nextDouble();
          while (expense >= 0){
                sumE += expense;
                System.out.print("Please enter the expense: $");
                expense = lee.nextDouble();
          }    
          System.out.println("Total expenditures: $" + sumE);
    }
}

