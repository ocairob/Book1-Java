
import java.util.Scanner;

public class IC3P13 {
    public static void main(String[] args){
        int model;
        double price, newPrice, discount=0;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the car model: ");
        model = lee.nextInt();
        System.out.print("Please enter the price of the car: $");
        price = lee.nextDouble();
        switch(model){
              case 1: discount = price * 0.03 + 2000;
                  break;
              case 3: 
              case 4: discount = price * 0.05 + 3500;
                  break;
              case 5: discount = price * 0.05 + 6000;
                  break;
              case 10: discount = price * 0.05 + 3000;
                  break;
              case 30: discount = price * 0.07 + 5000;
                  break;
              case 50: discount = price * 0.09 + 7000;
                  break;
        }
        newPrice = price - discount;	
        System.out.print ("\nModel:       " + model);
        System.out.print ("\nPrice:       $" + price);
        System.out.print ("\nNew price: $" + newPrice);           
    }
}

