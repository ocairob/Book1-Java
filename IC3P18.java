import java.util.Scanner;

public class IC3P18 {
    public static void main(String[] args){
        int x;
        double y;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the value of x (whole): ");
        x = lee.nextInt();
        if (x < 0 || x > 30)
              y = 0;
        else if (x <= 10)
              y = 5 * x + 12;
        else if (x <= 20)
              y = Math.pow(x, 2);
        else       
              y = Math.pow(x, 3) + 5;
        System.out.printf("\nx: " + x);
        System.out.printf("\ny: " + y);      
    }
}


