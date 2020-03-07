package OopConcepts;

public class StillTrying {

    public static void main(String[]args){
        Car honda = new Car();
        honda.setMake("pilot");
        System.out.println(honda.getMake());

        honda.setColor("blue");
        System.out.println(honda.getColor());

        honda.setYear(1990);
        System.out.println(honda.getYear());

        honda.setDamage(10000);
        System.out.println("this car has " + honda.getDamage() + " dollars worth of damage");

        honda.setSafety(5);
        System.out.println("this car has a review on safety of " + honda.getSafety());

        honda.setAwards(10);
        System.out.println(honda.getAwards());

    }
}
