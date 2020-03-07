import java.util.Scanner;

import java.util.Random;

public class Guess {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("enter an int from 1 to 10: ");

        int inputNumber = input.nextInt();

        int randomNumber = new Random().nextInt(10) + 1;

        if (inputNumber == randomNumber) {

            System.out.println("Congrats broski");

        } else {

            System.out.print("you goofed bro.");

            System.out.println("the random number was " + randomNumber);


        }
    }
}
