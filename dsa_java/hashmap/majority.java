package hashmap;
import java.util.*;
public class majority{
    public static void majorityElement(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(map.containsKey(nums[i])) {
            map.put(nums[i],map.get(nums[i])+1);
        } else {
            map.put(nums[i], 1);
        }
    }

    for (int key: map.keySet()) {
    if(map.get(key) > n/3 ){
        System.out.println(key);
    }
    }
    }
    public static void main (String args[]) {
      //  int nums[] = {1,3,2,5,1,3,1,5,1}; 
    int nums[] = {1,2};
    majorityElement(nums);
    }
}


algotithm <br>
    understand the question  <br>
    Q) more than n/3 times  <br>
    so if there is an array of integers like <br>
    int nums[] = {1,3,2,5,1,3,1,5,1} so the value should be 9/3  <br>
    which is 3 and the value which is greater than 3  is 5 and 5 is occuring 2 times  <br>
    but hashmap doesnt take duplicates so 5 is counted as 1 <br>
    hence the number of occurance is 1 <br>
    similarly for {1,2} the n is 2 so 2/3 which is 0.6 <br>
    and the value which is greater than 0.6 is 1,2 
