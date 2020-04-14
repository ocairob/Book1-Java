import java.util.Scanner;
// You must include this library to be able to use the Scanner class

public class IC2P1 {
    public static void main(String[] args) {
    	int whole1, whole2;
    	double result; 
    	Scanner lee = new Scanner(System.in);
    	/* This is how you declare and instantiate the object read that will let you read 
         the data. */
    	System.out.println("Please enter two whole numbers: ");
    	whole1 = lee.nextInt();        
        // This is how you can read a whole-number datum: nextInt()
    	whole2 = lee.nextInt();
    	result = (double)(whole1+whole2)/2;     
        // You must perform a casting because otherwise the result will be truncated
        System.out.println ("\nResult: " + result);
    }
}
