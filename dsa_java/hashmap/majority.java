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
    Q) more than n/3 times or can say find occurance, frequency, appearance  <br>
    so if there is an array of integers like <br>
    int nums[] = {1,3,2,5,1,3,1,5,1} then  <br>
    1 is occuring 4 times  <br>
    3 is occuring 2 times  <br>
    2 is occuring 2 times  <br>
    5 is occuring 2 times  <br>
    and 9/3 is 3  <br>
    the value greater than 3 is 4 times so the output is 1 <br>
    hence the majority number of occurance is 1 <br>
    similarly for {1,2} the n is 2 so 2/3 is 0.6 <br>
    1 is occuring 1 times  <br>
    2 is occuring 1 times  <br>
    and the value which is greater than 0.6 is 1,2  <br>
    so the output is 1,2 <br> <br>

    found the answers lesgooo <br>
    now to code <br>
    the algorithm is divided into 3 parts <br>
    1) create a hashmap <br>
    2) find freqquency and store in map <br>
    3) traverse map to find n/3 <br> <br>

    pseudocode <br>
    1) create a hashmap <br>
    HashMap<Integer, Integer> map = new HashMap<>(); <br>
    which value should be key and which one should be value <br>
    case 1 ->frequency as key, nums as value <br>
    nums might be same and then we need to use another linked list that will increase the time complexity <br>
    case 2 -> nums as key, frequency as value <br>
    is better <br> <br>

    2) find freqquency and store in map  <br>
    nums[i] containsKey <br>
    case 1 -> exist <br>
    freq = freq+1 <br>
    uppdate <br>
    case 2 -> not exist <br>
    freq = 1 <br>
    add <br>
         if(map.containsKey(nums[i])) { <br>
            map.put(nums[i],map.get(nums[i])+1); <br>
        } else { <br>
            map.put(nums[i], 1); <br>
        } <br> <br>

    3) traverse map to find n/3 <br>
        map.keySet() it returns whole set <br>
        for (int key: map.keySet()) { <br>
    if(map.get(key) > n/3 ){ <br>
        System.out.println(key); <br>
    } <br>
    } <br>
  
    
    
    
    
    
    
