import java.util.Scanner;

public class IC4P5 {
    public static void main(String[] args){
        int i, n, enrollment, enrollmentHG = 0, enrollmentLG = 0;
        double averageG, groupAG = 0, highestG = 0, lowestG = 10;
        /* The highestG and lowestG variables are initialized with the lowest and 
        highest value, respectively, so that they can be modified with the first input 
        value. */
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the number of students: ");
        n = lee.nextInt();
        for (i= 0; i < n; i++){
            System.out.print("Please enter the enrollment number and student average" 
                 +(i+1) + ": ");
            enrollment = lee.nextInt();
            averageG = lee.nextDouble();
            if(averageG > highestG){
                  highestG = averageG;
                  enrollmentHG = enrollment;
            }
            if(averageG < lowestG){
                  lowestG = averageG;
                  enrollmentLG = enrollment;
            }
            groupAG += averageG;
        }
        groupAG = groupAG / n;
        System.out.printf("The group's average grade: %.2f", groupAG);
        System.out.println("\nThe enrollment number and the highest grade: " +   
             enrollmentHG + " " + highestG);
        System.out.println("The enrollment number and the lowest grade: " + 
             enrollmentLG + " " + lowestG);
    }
}

