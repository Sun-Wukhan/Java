import java.util.Scanner;
import java.util.Random;

public class Temperature {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int temperature;
        temperature = 20;

        if (temperature >= 10 && temperature <= 15){
            System.out.println("Please wear a jacket");
        } else if (temperature >15) {
            System.out.println("The weather seems fine");
        }
    }
}