import java.util.Scanner;
public class Heat {

    public Heat() {
        System.out.println("I am a default constructor");
    }

    public static void main (String[]args) {
        Heat myHeat = new Heat();
             myHeat.turnOffHeat();

    }
    public void turnOffHeat() {

        int initialValue = 36;
        int finalTemperature = 70;
        int [] temperatureArray = new int[35 ];
        int arrayIndex = 0;

        while (finalTemperature >= initialValue) {
            temperatureArray[arrayIndex] = initialValue;
            initialValue++;
            arrayIndex++;
        }
        System.out.println("Turn off stove");
        System.out.println("length" + temperatureArray.length);
    }
}
