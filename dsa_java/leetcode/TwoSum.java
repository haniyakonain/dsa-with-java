package leetcode;
import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> num_map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) { 
            int complement = target - nums[i];// logic- target - nums[i]
            
            if (num_map.containsKey(complement)) {
                return new int[] {num_map.get(complement), i}; 
            }
            
            num_map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No solution found"); 
    }
}
public class TwoSum {  // Note: filename should be TwoSum.java
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
