import java.util.Scanner;

public class RollDice {



    public static void main(String[] args){

        Scanner input=new Scanner( System.in );



        int dice1;

        int dice2;



        System.out.println("roll dice 1");

        dice1 = input.nextInt();

        System.out.println("roll dice 2");

        dice2 = input.nextInt();



        System.out.println(dice1+dice2);

    }

}

