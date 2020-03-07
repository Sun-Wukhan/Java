import java.util.Scanner;
import java.util.Random;
public class Fight {

    public static void main(String[] args) {

        Scanner p1 = new Scanner(System.in);
        Fight melee = new Fight();
        int randomizer = new Random().nextInt(9) + 1;
        System.out.println("Welcome to fight night ".toUpperCase());
        System.out.println("Where would you like to fight? Select a number from 1 to 10");

        melee.stage();
        melee.load();
        melee.buffer();
        melee.weapons();
    }

    public void stage() {

        int stage;
        Scanner p2 = new Scanner(System.in);
        stage = p2.nextInt();

        System.out.println("******You have chosen******" + p2.nextLine());

        switch (stage) {
            case 1:
                System.out.println("Jane & Finch ");
                break;
            case 2:
                System.out.println("Kirby Dream world");
                break;
            case 3:
                System.out.println("Hyrule temple");
                break;
            case 4:
                System.out.println("Varrock");
                break;
            case 5:
                System.out.println("Jackson Heights");
                break;
            case 6:
                System.out.println("White house");
                break;
            case 7:
                System.out.println("Taliban Hideout music video shoot");
                break;
            case 8:
                System.out.println("Drake's Mansion");
                break;
            case 9:
                System.out.println("Junior's Belly");
                break;
            case 10:
                System.out.println("MAGA COUNTRY");
                break;
        }
    }

    public void load() {
        int bar = 3;
        boolean ready = true;
        boolean not = false;
        System.out.println("Preparing Files");

        System.out.println(true);

        }

        public void damage(){

        int damage = 0;
        String phase;

        if (damage >= 10 && damage <=20) {
            phase = "I could do this all day";
        } else if (damage >=21 && damage <=40) {
            phase = "Ouch";
        } else if (damage >= 41 && damage <=60) {
            phase = "This is starting to hurt";
        } else if (damage >=61 && damage <=80) {
            phase = "I don't know if I can hold out";
        } else if (damage >=81 && damage <=99) {
            phase = "I'm almost done";
        } else {
            phase = "KO";
        }
    }

      public void weapons() {
        Scanner p3 = new Scanner(System.in);
        System.out.println("Choose your weapon ");
        int wield;
        wield = p3.nextInt();
        int sword = 1;
        int shield = 2;
        int gun = 3;
        int knife = 4;
        int chair = 5;
        int sandals = 6;

      }


       public void buffer() {
        int start = 0;
        int end = 99;
        while (start>end) {
            start++;
        }
        System.out.println("Game is ready");
       }
}