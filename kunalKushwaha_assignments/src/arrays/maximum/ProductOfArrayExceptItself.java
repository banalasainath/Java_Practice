package arrays.maximum;
import java.util.*;
//Given an integer array nums, return an array answer such that answer[i] is equal to the 
//product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
public class ProductOfArrayExceptItself {
    static int[] productExceptSelf(int[] nums) {
    	int n = nums.length;
        int[] out = new int[n];
        int temp =1;
        for(int i =0;i<nums.length;i++) {
        	out[i]=temp;
        	temp=temp*nums[i];
        }
        int temp1 =1;
        for(int i= nums.length-1;i>=0;i--) {
        	out[i]=out[i]*temp1;
        	temp1=temp1*nums[i];
        }
        return out;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(productExceptSelf(nums)));
	}

}
