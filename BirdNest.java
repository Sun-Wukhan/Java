import java.util.Scanner;
public class BirdNest {

    public static void main(String[]args) {
        Scanner Jeeves = new Scanner(System.in);

        System.out.println("What is your age ");
        int age = Jeeves.nextInt();

        if (age >50) {
            System.out.println("you old bruh");
             if (age > 60) {
                 System.out.println("you super old dog");
             }
        } else if (age < 30)
            System.out.println("you not old bruh");
        }
    }

