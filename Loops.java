public class Loops {

    public static void main(String[] args) {
        Loops p1 = new Loops();

        //p1.Practice1();
        //p1.Practice2();
        //p1.Practice3();
        //p1.Practice4();
        //p1.Practice5();
        //p1.Practice6();
        //p1.Practice7();
        p1.Practice8();
    }

    public void Practice1() {

        int i = 1;

        do {
            System.out.println(i);
            i++;
        }
        while (i >= 5);
    }

    public void Practice2() {
        int i = 1;
        while (i < 10) {
            System.out.print(i);
            i++;
        }
    }

    public void Practice3() {
        int i = 1;
        while (i <= 10) {
            System.out.println("count down " + i);
            i++;
        }
    }

    public void Practice4(){

        for(int i =0; i <=10; i++){
            System.out.println("Practice 4 countdown coming at you " + i);
        }
    }

    public void Practice5(){
        int i = 1;
        do {
            System.out.println(i++);
        } while (i<=5);
    }

    public void Practice6(){
        int i = 1;
        do {
            System.out.println(i++);
        } while (i<12);
    }

    public void Practice7(){
        int i = 10;

        while (i<20) {
            System.out.println(i);
            i++;
            if (i==17);
            continue;
        }
        System.out.println("outside loop");
    }

    public void Practice8(){
        int i = 2;

        do {
            System.out.println(i++);
        } while (i <=10);
    }

}






