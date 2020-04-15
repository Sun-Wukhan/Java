import java.util.*;
public class Main {
   
    
                public static void main(String[] args) {
                    String next, opposite = "";
      Scanner in = new Scanner(System.in);  
      System.out.println("Enter a phrase//word"); 
      next = in.nextLine();  
      
      int length = next.length();  
      for ( int i = length - 1; i >= 0; i-- ) 
         opposite = opposite + next.charAt(i); 
      if (next.equals(opposite)) 
         System.out.println("This here is a PALINDROME"); 
      else 
         System.out.println("GET OUT");  
   } 
} 
