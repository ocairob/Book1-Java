import java.util.Scanner;

public class IC4P15 {
    public static void main(String[] args){
        int term = 1, sumS = term;
        boolean flag = true; 
        while (term <= 690){
            System.out.println("Term: " + term);
            if (flag){
                   term += 4;
                   flag = false;
            }
            else {
                   term += 3;
                   flag = true;   
            }
            sumS += term;
        }
        System.out.print("Sum of terms: " + sumS);
    }
}


