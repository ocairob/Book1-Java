import java.util.Scanner;

public class IC4P13 {
    public static void main(String[] args){
        int wholeN, sumD= 0, i; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the whole number: ");
        wholeN  = lee.nextInt();
        for(i= 1; i <= wholeN / 2; i++)
              if(wholeN % i == 0)
                     sumD += i;
        if(sumD == wholeN)
              System.out.println(wholeN + " is a perfect number");
        else
              System.out.println(wholeN + " is not a perfect number");
    }
}

