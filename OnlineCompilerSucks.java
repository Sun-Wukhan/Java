import java.util.Scanner;
public class Main {
   
    private String breed;
    private int height;
    
                public static void main(String[] args) {
                    Main p1 = new Main();
                    p1.setBreed("German");
                    p1.setHeight(12);
                    p1.display();
                }
               
                public void setBreed(String breed){
                    this.breed = breed;
                   
                }
               
                public String getBreed(){
                    return breed;
                }
               
                public void setHeight(int height){
                    this.height = height;
                }
               
                public int getHeight(){
                    return height;
                }
               
                public void display(){
                    System.out.println(getBreed() + getHeight());
                }
}
