import java.util.Scanner;

public class IC3P14 {
    public static void main(String[] args){
        int code, nMinutes;
        double cost;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the code of the geographic zone: ");
        code = lee.nextInt();
        System.out.print("Please enter the number of minutes: ");
        nMinutes = lee.nextInt();   
        cost = 0;
        switch(code){
               case 12: cost = nMinutes * 0.9;
                   break;
               case 15: cost = nMinutes * 0.8;
                   break; 
               case 18: cost = nMinutes * 1.2;
                   break;
               case 21: cost = nMinutes * 1.6;
                   break;
               case 23: cost = nMinutes * 1.9;
                   break;
               case 29: cost = nMinutes * 2.4;
                   break;
        }
        System.out.printf("\nTelephone call cost: $%.2f", cost);           
    }
}
