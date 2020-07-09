import java.util.Scanner;
public class IC4P24 {
    
public static void main(String[] args){
        int n, i;
        double averageT = 0, longestT = 0, throwH; 
        Scanner lee = new Scanner(System.in);
        do{           
               System.out.print("Please enter the number of throws (1..6): ");
               n = lee.nextInt();    
        } while(n < 1 || n > 6);
        for (i= 1; i <= n; i++){
               System.out.print("\nPlease enter the throw " + i + ": ");               
               throwH = lee.nextDouble();
               if (throwH > longestT)
                     longestT = throwH;
               averageT += throwH;
        }
        averageT = averageT / n;
        System.out.print("\nAverage throw: " + averageT);
        System.out.print("\nLongest throw: " + longestT);        
    }
}

