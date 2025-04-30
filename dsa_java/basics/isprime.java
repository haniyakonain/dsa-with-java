package basics;
import java.util.*;
public class isprime {
   public static void main (String args []) {
     try ( Scanner sc = new Scanner(System.in)){
      System.out.print("enter a number to check if the number is prime or not :");
      int n = sc.nextInt();
      if (n == 2) {
         System.out.println("n is prime");
      } 
      else {
         boolean isprime = true;
         for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
            isprime = false;             
            }
         }
         if (isprime == true) {
            System.out.println("n is prime");
         }
         else {
            System.out.println("n is not prime");
           }
         }
      }
   }
}