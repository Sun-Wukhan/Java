import java.util.Scanner;

public class Millionaire {



    public static void main(String[] args){

        Scanner keyboard = new Scanner( System.in );

        int answer = 1;

        int zimbabwe =2;

        int newyork=3;

        int africa=4;



        System.out.println("What is the capital city of Ontario");

        System.out.println("1. Toronto");

        System.out.println("2. Zimbabwe");

        System.out.println("3. New York");

        System.out.println("4. Africa");



        System.out.println("What is your answer");

        answer=keyboard.nextInt();

        if(answer==1) {

            System.out.println("congrats");

        } else {

            System.out.println("nope");

        }



    }

}

