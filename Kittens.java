public class Kittens {

    private String kitten;
    private String dog;

    public void setKitten(String name) {

        kitten=name;
    }

    public String getKitten(){
        return kitten;
    }

    public void displayCat(){
        System.out.println("my kittens name is " + getKitten());
    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    public void displayDog() {
        System.out.println("my favourite dog is " + getDog());
    }
}