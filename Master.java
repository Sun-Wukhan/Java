import java.util.Scanner;
import java.util.Random;

public class Master {

    public static void main(String[]args){
        Scanner Clicker = new Scanner(System.in);
        Random Trade = new Random();
        Weapons GodSword = new Weapons();
        GodSword.setBrand("Saradomin GodSword");
        System.out.println(GodSword.getBrand());

        GodSword.Examine();
        GodSword.putOn();
        GodSword.takeOff();
        GodSword.Drop();


    }
}
