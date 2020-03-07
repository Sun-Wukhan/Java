import java.util.Scanner;

public class Monopoly {



    public static void main(String[] args){

        Scanner keyboard = new Scanner( System.in );



        int dice1=2;

        int dice2=3;

        int roll;

        roll = dice1 + dice2;



        System.out.print("You have rolled a ");

        System.out.println(roll);



        Boolean boardwalk = roll ==5;



        System.out.println("oh no, you rolled a 5. are you going to land on boardwalk?");

        System.out.println(boardwalk);

    }

}



