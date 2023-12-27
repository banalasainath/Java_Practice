package arrays.easy;

import java.util.Arrays;

//Given a zero-based permutation nums (0-indexed), build an array ans of the same length where 
//ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
//
//A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 
//		(inclusive).
//Input: nums = [0,2,1,5,3,4]
//Output: [0,1,2,4,5,3]
public class BuildArray {
	static int[] buildArray(int[] nums) {
        int[] out=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            out[i]=nums[nums[i]];
        }
        return out;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,2,1,3,4};
		System.out.println(Arrays.toString(buildArray(arr)));
	}

}
