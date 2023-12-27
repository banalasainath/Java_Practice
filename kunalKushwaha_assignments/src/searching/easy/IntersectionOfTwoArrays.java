package searching.easy;
import java.util.*;
//Given two integer arrays nums1 and nums2, return an array of their intersection. 
//Each element in the result must be unique and you may return the result in any order.
//Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//Output: [9,4]
//Explanation: [4,9] is also accepted.
public class IntersectionOfTwoArrays {
    static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> out = new HashSet<Integer>();
        for(int i =0;i<nums1.length;i++) {
        	set.add(nums1[i]);
        }
        for(int i =0;i<nums2.length;i++) {
        	if(set.contains(nums2[i])) {
        		out.add(nums2[i]);
        	}
        }
        int[] out1 = new int[out.size()];
        int ind =0;
        for(int i:out) {
        	out1[ind++]=i; 
        }
        return out1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1={4,9,5};
		int[] nums2 = {9,4,9,8,4};
		System.out.println(Arrays.toString(intersection(nums1,nums2)));
	}	

}
