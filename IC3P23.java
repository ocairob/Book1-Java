import java.util.Scanner;

public class IC3P23 {
    public static void main(String[] args){
        int code, classification, yearsS, answer;  
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the employee code: ");
        code = lee.nextInt();
        System.out.print("Please enter the employee classification: ");
        classification = lee.nextInt ();
        System.out.print("Please enter the employee years of service: ");
        yearsS = lee.nextInt ();
        answer = 0;
        switch (classification) {
               case 3:
               case 5: if (yearsS >= 5)
                                answer = 1;
                    break;
            case 2: if (yearsS >= 10)
                               answer = 1;
                    break;
        }
        if (answer == 1)
               System.out.println("\nEmployee with code " + code + " meets the "
                       + "requirements for the position");
        else 
               System.out.println("\nEmployee with code " + code + " does not meet the" 
                       + "requirements for the position");
    }
}
