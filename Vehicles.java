package OopConcepts;

public class Vehicles {

    private String make;
    int speed;
    int gear;

    public Vehicles() {
     this(10, 2);
     this.speed = 0;
     this.gear = 0;
     System.out.println("Fast car bruh");
    }

    public Vehicles(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        System.out.println("Newer Car");
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake(){
        return make;
    }
}