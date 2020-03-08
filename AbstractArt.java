
abstract class Dog {
    String breed;
    public void bark(){
        System.out.println("This is a bark");
    }

    public abstract void poop();

    }

class chihuahua extends Dog {

    public void poop(){
        System.out.println("This will let me poop");
    }

}

public class AbstractArt {

    public static void main(String[]args){
        chihuahua c1 = new chihuahua();

        c1.bark();
        c1.poop();

    }
}
