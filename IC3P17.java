import java.util.Scanner;

public class IC3P17 {
    public static void main(String[] args){
        int employeeID;
        double salary, nSalary;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the employee identification number: ");
        employeeID = lee.nextInt();
        System.out.print("Please enter the employee's salary: $");
        salary= lee.nextDouble();
        if (salary < 4000)
              nSalary = salary * 1.048;
        else if (salary < 7500)
              nSalary = salary * 1.042;
        else
              nSalary = salary * 1.038;   
        System.out.printf("\nEmployee identification number: " + employeeID);
        System.out.printf("\nNew salary: $" + nSalary);       
    }
}
