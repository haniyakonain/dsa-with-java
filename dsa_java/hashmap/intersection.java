package hashmap;
import java.util.*;
public class intersection {
    public static int inter(int arr1[], int arr2[]){
        HashSet<Integer>Set= new HashSet<>();
        int count=0;
        for (int i=0; i<arr1.length; i++) {
            Set.add(arr1[i]);
        }
        for (int j=0; j<arr2.length; j++) {
            if(Set.contains(arr2[j]))
            count++;
            Set.remove(arr2[j]);
        }
    return count;
    }

public static void main( String args []){
    int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        System.out.println(inter(arr1, arr2));
    }
}