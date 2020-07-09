import java.util.Scanner;

public class IC3P11 {
    public static void main(String[] args){
        int level;
        double salary, newSalary = 0.0;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the worker level: 1..4: ");
        level = lee.nextInt();
        System.out.print("Please enter the worker salary: $");
        salary = lee.nextDouble();
        newSalary = salary;
        switch(level){
              case 1: newSalary = salary * 1.12;
                    break;
              case 2: newSalary = salary * 1.08;
                    break;
              case 3: newSalary = salary * 1.05;
                    break;
              case 4: newSalary = salary * 1.038;
                    break;
        } 
        System.out.printf("\nLevel: " + level);
        System.out.printf("\nSalary: $%.2f", salary);
        System.out.printf("\nNew salary: $%.2f", newSalary);
    }
}

