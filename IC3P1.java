import java.util.Scanner;

public class IC3P1 {
    public static void main(String[] args) {
        double grade;
        Scanner lee = new Scanner(System.in);
        System.out.print("\nPlease enter the student's grade: ");
        grade = lee.nextDouble();
        if (grade>= 6)
              System.out.println("\nPass");               
    }   
}

