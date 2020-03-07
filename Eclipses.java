public class Eclipses {

    public static void main (String[]args){
        System.out.println(averages(15, 24, 45, 23, 22));
    }

    public static int averages(int...numbers){
        int total = 0;
        for (int x:numbers)
            total+=x;

        return total/numbers.length;
    }
}
