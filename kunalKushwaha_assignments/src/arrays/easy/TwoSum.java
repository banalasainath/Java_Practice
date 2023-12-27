package arrays.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target, return indices of the 
//two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not 
//use the same element twice.
//You can return the answer in any order.
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
public class TwoSum {
    static int[] twoSum(int[] nums, int target) {
//        int[] out = new int[2];
//        outer:
//        for(int i=0;i<nums.length;i++) {
//        	for(int j=i+1;j<nums.length;j++) {
//        		if(nums[i]+nums[j]==target) {
//        			out[0]=i;
//        			out[1]=j;
//        			break outer;
//        		}
//        	}
//        }
//        return out;
    	
//    	Another approach
        int[] out = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                out[0]=i;
                out[1]=map.get(target-nums[i]);
                return out;
            }
            map.put(nums[i],i);
        }
        return out;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums,target)));
	}

}
