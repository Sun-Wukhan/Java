import java.util.Scanner;
import java.util.Random;
public class GameBoy {
    public static void main(String[] args) {
        System.out.println("I am a main method");
        String model;
        model = "Gum";
        int size;
        size = 70;

        GameBoy myGameBoy = new GameBoy();
        myGameBoy.play("great");
        myGameBoy.start(70);
    }
    public void play(String model) {
        System.out.println("this method will let me play " + model);
    }

    public void start(int size) {
        System.out.println("This method will let me start the gameboy with a screen size of " + size);
    }


}