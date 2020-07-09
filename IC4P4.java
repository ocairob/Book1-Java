import java.util.Scanner;

public class IC4P4 {
    public static void main(String[] args){
        int i, n, oddCount= 0, number, evenSum = 0, oddSum = 0;
        double oddAverage;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter how many numbers are in the group: ");
        n = lee.nextInt();
        for (i= 0; i < n; i++){
              System.out.print("Please enter the number " + (i+1) + ": ");
              number = lee.nextInt();
              if (Math.pow(-1,number)>0)
                     evenSum = evenSum + number;
              else{
                     oddSum = oddSum + number;
                     oddCount = oddCount + 1;
              }
        }
        oddAverage = (double) oddSum / oddCount;
        System.out.print("Even sum: " + evenSum + "\t");
        System.out.printf("oddAverage: %.2f", oddAverage);
    }
}

