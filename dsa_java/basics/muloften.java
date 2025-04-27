package basics;
import java.util.Scanner;
public class muloften {
    public static void main (String [] args) {
     /*   Scanner sc = new Scanner (System.in);
       do { 
           System.out.println("enetr a number");
           int num = sc.nextInt();
           if (num % 10 == 0){
            break; //checking break 
           }
       } while (true);*/ 
        Scanner sc = new Scanner (System.in);
        do {
            System.out.print("enter a number: " );
        int num = sc.nextInt();
        if (num % 10 == 0) {
            continue; // checking continue
        }
        System.out.println("your number is : " + num);
    } while (true);   
    }
}
