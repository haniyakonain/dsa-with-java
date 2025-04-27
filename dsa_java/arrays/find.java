package arrays;

 import java.util.*;

public class find {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int [] arr = new int [size];
       for (int i = 0 ; i < size; i++) {
        arr [i] = sc.nextInt();
       }
       int x = sc.nextInt();
       for(int i = 0; i < arr.length; i++){
        if (arr[i] == x){
            System.out.println("number found at index:" +i);
        } 
       }
       sc.close();
    }
}