import java.util.Scanner;
public class Bloop {

    public static void main(String[]args) {
        Scanner Fido = new Scanner(System.in);
        Kittens meow = new Kittens();
        Kittens bark = new Kittens();

        System.out.println("who is your favourite cat? ");


        System.out.println("who is your favourite dog ");
        String answer1 = Fido.nextLine();

        meow.setKitten("Junior");
        meow.displayCat();

        bark.setDog(answer1);
        bark.displayDog();



    }
}
