
import java.util.Scanner;

public class IC4P9 {
    public static void main(String[] args){
        int i, first = 0, second = 1, sum = first + second, next = 0;
        for (i= 3; i <= 22; i++){
              next = first + second;
              sum += next;
              first = second;
              second = next;
        }    
        System.out.println("Term 22 of the Fibonacci series = " + next);
        System.out.println("Sum of the series = " + sum);    
    }
}


