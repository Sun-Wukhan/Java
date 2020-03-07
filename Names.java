import java.util.Scanner;

public class Names {



    public static void main(String[] args){

        Scanner input=new Scanner( System.in );



        String firstName;

        String lastName;



        System.out.println("What is your first name?");

        firstName = input.nextLine();



        System.out.println("What is your last name?");

        lastName=input.nextLine();



        System.out.println("Nice to meet you " + firstName + " " + lastName);



    }

}

