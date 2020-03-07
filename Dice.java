import java.util.Scanner;

public class Dice {



    public static void main(String[] args){

        Scanner keyboard = new Scanner( System.in );

        int rollDice;

        rollDice = 6;



        switch (rollDice) {

            case 1:

                System.out.println("Haha, terrible roll");

                break;

            case 2:

                System.out.println("Snake eyes");

                break;

            case 3:

                System.out.println("why are you terrible at rolling dice");

                break;

            case 4:

                System.out.println("HAHA! FourEyes");

                break;

            case 5:

                System.out.println("Nice Roll!");

                break;

            case 6:

                System.out.println("winner, winner chicken dinner");

        }

    }

}

