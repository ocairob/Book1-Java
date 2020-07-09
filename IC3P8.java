import java.util.Scanner;

public class IC3P8 {
    public static void main(String[] args) {
        int distance, days;
        double cost;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the distance between cities: ");
        distance = lee.nextInt();
        System.out.print("Please enter the number of days of the trip: ");
        days = lee.nextInt();
        cost = distance * 2 * 0.65;
        if (distance * 2 > 500 && days > 10)
              cost = distance* 2 * 0.65 * 0.80;
        System.out.printf("\nTicket cost: $%.2f", cost);
    }
}


