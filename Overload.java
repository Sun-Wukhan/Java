public class Overload {

    int x = 5;

    public static void main(String[]args){

        int num1 = plusMethods(5, 2);
        double num2 = plusMethods(5.4, 3.2);
        System.out.println(num1);
        System.out.println(num2);
    }

    public static int plusMethods(int x, int y) {
        return x + y;
    }

    public static double plusMethods(double x, double y) {
        return x + y;
    }
}
