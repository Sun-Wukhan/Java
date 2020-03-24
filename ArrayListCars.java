import java.util.ArrayList;
public class Main {
   
    private String name;
    private int account;
   
    
                public static void main(String[] args) {
                                ArrayList<String> cars = new ArrayList<String>();
                               
                                cars.add("BMW");
                                cars.add("Mazda");
                                cars.add("Lexus");
                                cars.add("Audi");
                               
                                System.out.println(cars);
                               
                                System.out.println(cars.get(0));
                               
                                cars.add("Benz");
                                System.out.println(cars);
                               
                                cars.set(0, "Nissan");
                                System.out.println(cars);
                               
                                cars.remove(1);
                                System.out.println(cars);
                               
                                System.out.println(cars.size());
                               
                                for (int i = 0; i<cars.size(); i++){
                                System.out.println(cars.get(i));
                                }
                }
               
}
