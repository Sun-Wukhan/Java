package OopConcepts;

public class ConstructorDemo {

    public static void main(String[]args) {

        Vehicles C1 = new Vehicles();

        C1.setMake("Lexus");
        System.out.println(C1.getMake());
        System.out.println(C1.speed);
        System.out.println(C1.gear);

        System.out.println("*********");

        Vehicles C2 = new Vehicles(10, 1);
        System.out.println(C2.speed);
        System.out.println(C2.gear);


    }
}
