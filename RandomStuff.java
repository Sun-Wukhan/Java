import java.util.*;
import java.util.Random;
    
public class Main {
   
    private String name;
   
                public static void main(String[] args) {
               
                                Main p1 = new Main();
                                p1.gangShit();
                                p1.numbersShit();
                                p1.setName("my Name is George");
                                System.out.println(p1.getName());
                                int num3 = myMethod(5, 7);
                                System.out.println(num3);
                                p1.rollDice();
                                p1.guessGame();
                }
               
               
                public void gangShit(){
                    System.out.println("This will allow me to be gang");
                }
               
                public void numbersShit(){
                    Scanner p2 = new Scanner(System.in);
                    System.out.println("what's your name");
                    String name = p2.nextLine();
                    System.out.println("nice to meet you " + name);
                }
               
                public void setName(String name){
                    this.name = name;
                }
               
                public String getName() {
                    return name;
                }
               
                public static int myMethod(int x, int y){
                    return x + y;
                }
               
                public void rollDice(){
                    int randomNumber = new Random().nextInt(6) + 1;
                    System.out.println("you have rolled a " + randomNumber + " on the dice ");
                }
               
                public void guessGame(){
                    System.out.println("Guess a number between 1 and 10 ");
                    Scanner p2 = new Scanner(System.in);
                    int guess = p2.nextInt();
                    int random = new Random().nextInt(10) + 1;
                    if(guess == random){
                        System.out.println("Good job!");
                    } else {
                        System.out.println("better luck next time");
                    } System.out.println("The real answer was " + random);
                }
}
