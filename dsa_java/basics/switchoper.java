package basics;

import java.util.Scanner;

public class switchoper {
   public static void main(String[] args) {
      System.out.println("Select 1 or 2 or 3");
     try( Scanner sc = new Scanner(System.in)){ //it automatically manages resource closing, no need to write sc.close();
      int var = sc.nextInt();
      switch (var) {
         case 1-> //Java 14+ -> instead of : and break;
            System.out.println("hi");
         case 2->
            System.out.println("bye");
         case 3->
            System.out.println("supp");
         default->
            System.out.println("wrong number");
         }
      }     
   }
}
/* In the new switch (switch -> syntax):
If only one line → no {} needed.
If multiple lines → you must use {} to group them.*/