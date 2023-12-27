package searching.easy;
import java.util.*;
//Given two integer arrays nums1 and nums2, return an array of their intersection. 
//Each element in the result must appear as many times as it shows in both arrays and you may 
//return the result in any order.
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2,2]
public class IntersectionOfTwoArraysWithRepetition {
    static int[] intersect(int[] nums1, int[] nums2) {
    	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    	List<Integer> list = new ArrayList<>();
    	if(nums1.length<nums2.length) {
    		int[] temp = nums1;
    		nums1=nums2;
    		nums2=temp;
    	}
    	for(int i=0;i<nums1.length;i++) {
    		if(map.containsKey(nums1[i])) {
    			map.put(nums1[i], map.get(nums1[i])+1);
    		}
    		else {
    			map.put(nums1[i], 1);
    		}
    	}
    	for(int i =0;i<nums2.length;i++) {
    		if(map.containsKey(nums2[i])&&map.get(nums2[i])!=0) {
    			map.put(nums2[i], map.get(nums2[i])-1);
    			list.add(nums2[i]);
    		}
    	}
    	int[] result = new int[list.size()];
		for(int i=0;i<list.size();i++) {
			result[i]=list.get(i);
		}
		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1= {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		System.out.println(Arrays.toString(intersect(nums1,nums2)));
	}

}
