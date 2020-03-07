import java.io.File;
import java.util.Scanner;

public class ReadingRabbit {

    public static void main(String[] args) throws Exception {
        // pass the path to the file as a parameter
        File file = new File("Insert File Here");
        Scanner p1 = new Scanner(file);

        while (p1.hasNextLine())
            System.out.println(p1.nextLine());
    }
}
