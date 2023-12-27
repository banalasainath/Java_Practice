package arrays.easy;
//Given an integer array nums, find the subarray which has the largest sum and 
//return its sum.
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
//Kadane's Algorithm
public class MaximumSubArray {
    static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<nums.length;i++) {
        	sum=sum+nums[i];
        	if(sum>max) max = sum;
        	if(sum<0) sum=0;
        }
        return max;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}

}
