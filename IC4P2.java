import java.util.Scanner;

public class IC4P2{
    public static void main(String[] args){
        double sal1, sal2, sal3, sal4, sal5, sal6, sal7, sal8, sal9, sal10, payroll; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the salary of the employee 1" + ": $");
        sal1 = lee.nextDouble();
        System.out.print("Please enter the salary of the employee 2" + ": $");
        sal2 = lee.nextDouble();
        System.out.print("Please enter the salary of the employee 3" + ": $");
        sal3 = lee.nextDouble();
        System.out.print("Please enter the salary of the employee 4" + ": $");
        sal4 = lee.nextDouble();
        System.out.print("Please enter the salary of the employee 5" + ": $");
        sal5 = lee.nextDouble();
        System.out.print("Please enter the salary of the employee 6" + ": $");
        sal6 = lee.nextDouble();
        System.out.print("Please enter the salary of the employee 7" + ": $");
        sal7 = lee.nextDouble();
        System.out.print("Please enter the salary of the employee 8" + ": $");
        sal8 = lee.nextDouble();
        System.out.print("Please enter the salary of the employee 9" + ": $");
        sal9 = lee.nextDouble();
        System.out.print("Please enter the salary of the employee 10" + ": $");
        sal10 = lee.nextDouble();
        payroll = sal1 + sal2 + sal3 + sal4 + sal5 + sal6 + sal7 + sal8 + sal9 + 
             sal10;
        System.out.print("Payroll : $" + payroll);
    }
}
