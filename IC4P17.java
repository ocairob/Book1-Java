import java.util.Scanner;
public class IC4P17 {
    public static void main(String[] args){
        int ranking1 = 0, ranking2 = 0, ranking3 = 0, ranking4 = 0, ranking5 = 0, i = 0;
        double sumG = 0, average, grade;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the student's grade " + (i+1) + ": ");
        grade = lee.nextDouble();
        while (grade != -1){
              i++;
              sumG += grade;
              if (grade < 4) 
                    ranking1++;
              else if (grade < 6) 
                    ranking2++;
              else if (grade < 8) 
                    ranking3++;
              else if (grade < 9) 
                    ranking4++;
              else
                    ranking5++;
              System.out.print("Please enter the student's grade " + (i+1) + ": ");
              grade  = lee.nextDouble();
          }
          average = sumG / i;
          System.out.print("Ranking 0..3.99: " + ranking1 + " Ranking 4..5.99: " + 
                ranking2);
          System.out.print("\nRanking 6..7.99: " + ranking3 + " Ranking 8..8.99: " + 
                ranking4);
          System.out.print("\nRanking 9..10: " + ranking5 + " Average: " + average);
     }
 }
