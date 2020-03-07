package OopConcepts;

public class Car {
    // color
    private String color;
    // make
    private String make;
    // model
    private String model;
    // year
    private int year;
    //safety
    private int safety;
    //damage
    private int damage;
    //awards
    public int awards;

    public void increaseSpeed() {
        System.out.println("Increasing the speed");
    }

    public void setMake(String make) {
        // by using this you link it up to the public class area
        this.make = make;

    }

    public String getMake() {
        return this.make;
    }

    public String getColor() {
        return color;

    }

    public void setColor(String color) {
        this.color = color;

    }

    public String getModel() {
        return model;

    }

    public void setModel(String model) {
        this.model = model;

    }

    public int getYear() {
        return year;

    }

    public void setYear(int year) {

        if (year < 2000) {
            this.year = year;
        } else {
            System.out.println("broke car");
        }

    }

    public void setSafety(int safety) {
        this.safety = safety;
    }

    public int getSafety() {
        return safety;
    }

    public void setDamage (int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public int getAwards() {
        return awards;
    }

    public void setAwards(int awards) {
        this.awards = awards;
    }
}
