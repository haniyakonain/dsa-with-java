package hashmap;
import java.util.*;
public class union {
    public static int unions(int arr1[], int arr2[]){
        HashSet<Integer>Set= new HashSet<>();
        for (int i=0; i<arr1.length; i++) {
            Set.add(arr1[i]);
        }
        for (int j=0; j<arr2.length; j++) {
            Set.add(arr2[j]);
        }
    return Set.size();
    }

public static void main( String args []){
    int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        System.out.println(unions(arr1, arr2));
    }
}