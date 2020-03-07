package OopConcepts;

public class YesSir {

    public static void main(String[]args) {
        PhoneGame myPhone = new PhoneGame();

        myPhone.setColor("black");
        System.out.println("Selling myPhone that is " + myPhone.getColor());

        myPhone.setModel("iPhone");
        System.out.println(myPhone.getModel());

    }
}
