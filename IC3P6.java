import java.util.Scanner;

public class IC3P6 {
    public static void main(String[] args) {
        double salary, increase, newSalary;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the worker's salary: $");
        salary = lee.nextDouble();
        if (salary < 4000)
                 increase = salary * 0.12;      
        else                
                 increase = salary * 0.08;        
        newSalary = salary + increase;        
        System.out.printf("\nIncrease: $%.2f", increase); 
        System.out.printf("\nNew salary: $%.2f", newSalary);   
   }
}

