//staic- fixed size, compile time, stack
//dynamic- not fixed, run time, heap

 package arrays;

import java.util.*;


public class dynamic{

    public static void main (String args[]){
     /*int[] arr = new int[3];
     arr [0]= 30;
     arr [1]= 40;
     arr [2]= 50;
     for (int i = 0; i < arr.length; i++)
     {
        System.out.println(arr[i]);
     }*/
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt ();
    int [] arr = new int[size];

    for (int i=0; i < size; i++){
    arr[i]=sc.nextInt();
    }

    for (int i = 0; i < size; i++){
       System.out.println(arr[i]);
      }
      sc.close();
    }
} 