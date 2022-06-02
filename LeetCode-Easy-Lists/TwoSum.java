import java.util.*;
/**
 Given an array of integers nums and an integer target, return indices of the two numbers such that 
 they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> list = new HashMap<Integer, Integer>();
        for(int i = 0;i<nums.length;i++){
            list.put(nums[i],i);
        }
         for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (list.containsKey(complement) && list.get(complement) != i) {
                return new int[] { i, list.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
    
}
