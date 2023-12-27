package arrays.easy;

import java.util.Arrays;
import java.util.List;

//Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. 
//That is, for each nums[i] you have to count the number of valid j's 
//such that j != i and nums[j] < nums[i].
//Input: nums = [8,1,2,2,3]
//Output: [4,0,1,1,3]
public class NumbersSmallerCurrentNum {
	static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] out1 = new int[nums.length];
        System.arraycopy(nums, 0, out1, 0, nums.length);
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++) {
        	for(int j=0;j<nums.length;j++) {
        		if(out1[i]==nums[j]) {
        			out1[i]=j;
        			break;
        		}
        	}
        }
        return out1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8,1,2,2,3};
		System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
		
	}

}
