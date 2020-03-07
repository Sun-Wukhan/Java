import java.util.Scanner;
public class Apples {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Tuna swordFish = new Tuna();

        System.out.println("who is your favourite person ever? ");
        String mon = input.nextLine();

        swordFish.setGirlfriend(mon);
        swordFish.display();


    }
}
