public class Accounts {

   private String name;
   private String address;
   private double amount;
   private double assets;
   private double mortgages;

    public static void main(String[]args) {
    Accounts p1 = new Accounts();

    p1.setName(" Navid ");
    p1.setAddress("219 Fort York Boulevard");
    p1.setAmount(1300);
    p1.setAssets(2100000);
    p1.setMortgages(1200000);
    p1.display();
   }

   public void setName(String name) {
        this.name = name;
   }

   public String getName(){
        return name;
   }

   public void setAddress(String address){

        this.address = address;
   }

   public String getAddress(){
        return address;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }

    public double amount(){
        return amount;
    }

    public void setAssets(double assets) {
        this.assets = assets;
    }

    public double getAssets(){
        return assets;
    }

    public void setMortgages(double mortgages) {
        this.mortgages = mortgages;
    }

    public double getMortgages(){
        return mortgages;
    }

    public void display() {
        System.out.println(getName() + getAddress() + getAssets() + getMortgages());
    }

}