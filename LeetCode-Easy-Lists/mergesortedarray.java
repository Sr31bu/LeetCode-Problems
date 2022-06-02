import java.util.*;
/**
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, 
and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside
 the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements 
 denote the elements that should be merged, and the last n elements are set to 0 and should be 
 ignored. nums2 has a length of n.
 */
public class mergesortedarray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums1Copy = new int[m];
        for (int i = 0; i < m; i++) {
            nums1Copy[i] = nums1[i];
        }
        int p1 = 0;
        int p2 = 0;
                
        for (int p = 0; p < m + n; p++) {
            if (p2 >= n || (p1 < m && nums1Copy[p1] < nums2[p2])) {
                nums1[p] = nums1Copy[p1++];
            } else {
                nums1[p] = nums2[p2++];
            }
        }
    }
    
}
