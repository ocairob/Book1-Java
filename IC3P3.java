import java.util.Scanner;

public class IC3P3 { 
    public static void main(String[] args) {
        int numberSounds;
        double temperature;
        Scanner lee = new Scanner(System.in);
        System.out.print("Please enter the number of cricket sounds: ");
        numberSounds = lee.nextInt();
        if (numberSounds >= 0){
              temperature = 10 + (numberSounds - 40) / 7;
              System.out.printf("\nThe temperature in degrees celsius is: %.2f", 
                    temperature);
        }                
    }
}


