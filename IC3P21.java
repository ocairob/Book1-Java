import java.util.Scanner;

public class IC3P21 {
    public static void main(String[] args){
        double salary, newSalary, overtimeV;
        int classification, overtimeN;
        // overtimeV ← overtime value
        // overtimeN ← number of overtime
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the employee's salary: $");
        salary = lee.nextDouble();
        System.out.print("Please enter the employee's classification: ");
        classification = lee.nextInt ();
        System.out.print("Number of overtime: ");
        overtimeN = lee.nextInt ();
        switch (classification) {
               case 1: overtimeV = 120;
                      break;
               case 2: overtimeV = 150;
                      break;
               case 3: overtimeV = 195;
                      break;
               case 4: overtimeV = 245;
                      break;
               default: overtimeV = 0;
                      break;
        }
        if (overtimeN > 30)
               newSalary = salary + 30 * overtimeV;
        else
               newSalary = salary + overtimeN * overtimeV;
        System.out.printf("\nNew employee's salary: $%.2f", newSalary);    
    }
}

