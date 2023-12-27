package arrays.easy;

import java.util.Arrays;

//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
public class SumOf1DArray {
	static int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }        
        return nums;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		System.out.println(Arrays.toString(runningSum(nums)));
	}

}
