import java.util.Scanner;

public class IC3P20 {
    public static void main(String[] args){
        double income, wt, netIncome;
        //wt = withholding tax
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the corresponding income: ");
        income = lee.nextDouble();
        if (income <= 20000)
               wt = 0;
        else if (income <= 40000)
               wt = (income - 20000) * 0.15;
        else if (income <= 70000)
               wt = (income - 20000) * 0.25;
        else if (income <= 100000)
               wt = (income - 20000) * 0.30;
        else 
               wt = (income - 20000) * 0.30;
        netIncome = income - wt;
        System.out.printf("\nWithholding tax: $%.2f", wt);
        System.out.printf("\nNet income: $%.2f", netIncome);  
    }
}   


