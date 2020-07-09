import java.util.Scanner;

public class IC4P3 {
    public static void main(String[] args){
        int i, n, sum= 0, number;
        double average;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter how many numbers are in the group: ");
        n = lee.nextInt();
        for (i= 0; i < n; i++){
               System.out.print("Please enter the number " + (i+1) + ": ");
               number = lee.nextInt();
               sum += number;
        }
        average = (double) sum / n;
        System.out.print("Sum = " + sum + "\t");
        System.out.printf("Average= %.2f", average);
    }
}

