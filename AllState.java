package AutoShow;

public class AllState {

    public static void main(String[] args) {
        InsuranceInfo c1 = new InsuranceInfo();
        AllState c2 = new AllState();

        c1.setOwner("Shayna Fox Lee");
        c1.setDamage("Front Rear Bumper:1200");
        c1.setMake("Mercedes Benz");
        c1.setModel("C300");
        c1.setInfo(31424);

        c1.display();
        c1.Navigation();
        c2.HeatedSeats();
        c2.luxury();


    }

    public void Navigation(){
        System.out.println("This car had navigation");
    }

    public void HeatedSeats(){
        System.out.println("This car had HeatedSeats");
    }

    public void luxury(){
        System.out.println("This was a luxury model");
    }
}
