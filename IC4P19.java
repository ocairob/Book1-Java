import java.util.Scanner;

public class IC4P19 {
    public static void main(String[] args){
        int can1 = 0, can2 = 0, can3 = 0, can4 = 0, i = 0, vote; 
        double can1P, can2P, can3P, can4P;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the vote (-1 to finish): ");
        vote = lee.nextInt();
        while (vote != -1){
               i += 1;
               switch (vote){
                     case 1: can1 += 1;
                         break;
                     case 2: can2 += 1;
                         break;
                     case 3: can3 += 1;
                         break;
                     case 4: can4 += 1;
                         break;
             }
               System.out.print("Please enter the vote (-1 to finish): ");
               vote  = lee.nextInt();
        }
        can1P = (double) can1 / i * 100; 
        can2P = (double) can2 / i * 100; 
        can3P = (double) can3 / i * 100; 
        can4P = (double) can4 / i * 100; 
        System.out.printf("\nCandidate 1: %2d votes \tVotes' percentage: %.2f", 
                can1, can1P);
        System.out.printf("\nCandidate 2: %2d votos \tVotes' percentage: %.2f", 
                can2, can2P);
        System.out.printf("\nCandidate 3: %2d votos \tVotes' percentage: %.2f", 
                can3, can3P);
        System.out.printf("\nCandidate 4: %2d votos \tVotes' percentage: %.2f", 
             can4, can4P);
    }
}

