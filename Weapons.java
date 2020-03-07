import java.net.StandardSocketOptions;

public class Weapons {

    private String brand;

    Weapons(){
       System.out.println("You have acquired the legendary GodSword: ");
    }

    public static void putOn() {
        System.out.println("You have equipped your weapon");
    }

    public static void takeOff(){
        System.out.println("you have taken off your weapon");
    }

    public static void Examine(){
        System.out.println("This sword belongs to the god Saradomin");
    }

    public static void Drop(){
        System.out.println("You have dropped your weapon");
    }

    public static void trade(){
        System.out.println("Selling legendary god sword for GF");
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }




}
