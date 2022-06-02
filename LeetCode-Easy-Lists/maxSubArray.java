import java.util.*;
/**
 Given an integer array nums, find the contiguous subarray (containing at least one number)
 which has the largest sum and return its sum.
 
A subarray is a contiguous part of an array.
 */
public class maxSubArray {
    public static int maximumSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int sumi = nums[0];
        int maxSum = 0;
        if(nums[0]>=nums[1]){
             maxSum = nums[0];
        }else{
            maxSum = nums[1];
        }
        for(int i = 0;i<nums.length-1;i++){
            if(maxSum<sumi){
                maxSum = sumi;
            }
            int j = i+1;
            int sumj = nums[j];
            if(sumj>=sumi){
                if(sumi>0){
                    sumi = sumi + sumj;
                }else{
                    sumi = sumj;
                }
            }else{
                sumi = sumi + sumj;
            }
        }
        if(sumi>maxSum){
            return sumi;
        }else{
            return maxSum;
        }
        
    }
    
}
