import java.util.Scanner;

public class IC3P22 {
    public static void main(String[] args){
        double dailyC, patientBill;
        int ageP, typeI, numberD; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter patient age: ");
        ageP = lee.nextInt();
        System.out.print("Please enter type of illness 1..4: ");
        typeI = lee.nextInt ();
        System.out.print("Please enter number of hospitalization days: ");
        numberD = lee.nextInt ();
        switch (typeI) {
               case 1: dailyC = 1150;
                      break;
               case 2: dailyC = 1980;
                      break;
               case 3: dailyC = 2500;
                      break;
               case 4: dailyC = 3150; 
                      break;
               default: dailyC = 0;
        }
        if (dailyC == 0)
               System.out.printf("\nThe type of entered illness is incorrect");
        else {
               patientBill = dailyC * numberD;
               if (ageP < 16)
                     patientBill = patientBill * 1.08;
               else if (ageP > 70)
                     patientBill = patientBill * 1.17;
               System.out.printf("\nEstimated cost of the patient for hospitalization: $%.2f", 
                     patientBill);
        }           
    }
}
