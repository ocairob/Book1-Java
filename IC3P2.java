import java.util.Scanner;

public class IC3P2 {
    public static void main(String[] args) {
        double salary, newSalary;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the worker's salary:  $");
        salary = lee.nextDouble();
        if (salary < 8000){
              newSalary = salary * 1.12;
              System.out.printf("\nThe new salary is:  $%.2f", newSalary);
        }
        /*Notice that, in the event that within the if statement there is more than one
        instruction, then these instructions must be placed within braces*/                 
    }
}


