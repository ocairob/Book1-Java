import java.util.Scanner;

public class IC3P4 {
    public static void main(String[] args) {
        double expense, discount = 0, payment;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter customer expense:  $");
        expense = lee.nextDouble();
        discount = 0;
        payment = discount;
        if (expense > 3000){
              discount = expense * 0.15;
              payment = expense - discount;
        }
        System.out.printf("\nExpense:  $%.2f", expense);
        System.out.printf("\nDiscount:  $%.2f", discount);
        System.out.printf("\nPayment:  $%.2f", payment);              
    }
}

