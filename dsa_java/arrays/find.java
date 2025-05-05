package arrays;
import java.util.*;


public class find {
    public static void main(String[] args) {
        int array [] = new int[100];
        System.out.println("length of array is: " + array.length);
        Scanner sc = new Scanner(System.in); // input
        array[0] = sc.nextInt();
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();
        System.out.println("marks 1 is:" + array[0] );
        System.out.println("marks 2 is:" + array[1] );
        System.out.println("marks 3 is:" + array[2] ); 
        System.out.println("average marks are " + (array[0] + array[1] + array[2]) / 3 + "%"); // percentage
        System.out.println(array[2] + 2); //  arithmetic operations
    }

}
