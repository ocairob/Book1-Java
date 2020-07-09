import java.util.Scanner;

public class IC3P24 {
    public static void main(String[] args){
        int typeP, adults, children;
        double cost=0, weddingC; 
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the type of package: ");
        typeP = lee.nextInt();
        System.out.print("Please enter the number of adults: ");
        adults = lee.nextInt();
        System.out.print("Please enter the number of children: ");
        children = lee.nextInt();
        switch (typeP) {
            case 1: cost = 30;
                break;
            case 2: cost = 39;
                break;
            case 3: cost = 64;
                break;
        }
        weddingC = cost * adults + cost * children * 0.60;
        if (adults > 100)
              if (adults > 250)
                    weddingC = weddingC * 0.85;
            else
                    weddingC = weddingC * 0.90;
        System.out.printf("\nCost of the wedding banquet: $" + weddingC);       
    }
}

