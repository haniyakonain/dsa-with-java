package basics;

import java.util.*;
public class ternary {
    public static void main (String args []) {
       Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
       /*ternary operator - 3 operands
        type variable name = condition? stm1(true) : stm2(false); */
   String var = (x % 2 == 0) ? "Even" : "Odd";
    System.out.println(var);
    sc.close();

    }
}