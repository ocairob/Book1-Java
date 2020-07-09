import java.util.Scanner;

public class IC4P20 {
    public static void main(String[] args){
        int typeS1 = 0, typeS2 = 0, typeS3 = 0, typeS4 = 0, typeS5 = 0, typeS, 
             qua, quaT; 
        double totalS = 0, sale = 0;  
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the type seat (1 a 5): ");
        typeS = lee.nextInt();
        System.out.print("Please enter the number of tickets: ");
        qua = lee.nextInt();
        while(typeS != -1 && qua != -1){
               switch (typeS) {
                      case 1: typeS1  += qua;
                                   sale = 105 * qua;                      
                                   break;
                      case 2: typeS2  += qua;
                                   sale = 75 * qua;
                                   break;
                      case 3: typeS3  += qua;
                                   sale = 52 * qua;
                                   break;
                      case 4: typeS4  += qua;
                                   sale = 38 * qua;
                                   break;
                      case 5: typeS5  += qua;
                                   sale = 20 * qua;
                                   break;   
         }
               totalS += sale;
               System.out.println("\nSale: $" + sale);
               System.out.print("Please enter the type seat (1 a 5): ");
               typeS = lee.nextInt();
               System.out.print("Please enter the number of tickets: ");
               qua = lee.nextInt();
        }
        quaT = typeS1 + typeS2 + typeS3 + typeS4 + typeS5;
        System.out.printf("\nNumber of tickets type seat 1: " + typeS1);
        System.out.printf("\nNumber of tickets type seat 2: " + typeS2);
        System.out.printf("\nNumber of tickets type seat 3: " + typeS3);
        System.out.printf("\nNumber of tickets type seat 4: " + typeS4);
        System.out.printf("\nNumber of tickets type seat 5: " + typeS5);
        System.out.printf("\nNumber of sold tickets: " + quaT);
        System.out.printf("\nTotal sale: $" + totalS);
    }
}
