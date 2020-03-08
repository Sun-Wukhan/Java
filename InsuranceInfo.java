package AutoShow;

public class InsuranceInfo {

    private String Damage;
    private int info;
    private String owner;
    private String make;
    private String model;

    public int getInfo() {
        return info;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }



    public void CarSpeed(){
        System.out.println("This method will let me speed");
    }

    public void setDamage(String damage){
        this.Damage=damage;
    }
    public String getDamage(){
        return Damage;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void Navigation(){
        System.out.println("This will let me navigate");
    }

    public void display(){
        System.out.println("The Driver of the Car: " + getOwner() + " got into an accident for: " + getDamage() + " on her " + getMake() + getModel() + " Issue number is " + getInfo() );
    }
}
