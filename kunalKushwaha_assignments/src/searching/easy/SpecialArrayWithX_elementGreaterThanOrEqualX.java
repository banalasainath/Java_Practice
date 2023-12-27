package searching.easy;

import java.util.HashMap;
import java.util.Map;

//You are given an array nums of non-negative integers. nums is considered special if there 
//exists a number x such that there are exactly x numbers in nums that are greater than or 
//equal to x.
//Notice that x does not have to be an element in nums.
//Return x if the array is special, otherwise, return -1. It can be proven that if nums is 
//special, the value for x is unique.
//Input: nums = [0,0]
//Output: -1
//Explanation: No numbers fit the criteria for x.
//If x = 0, there should be 0 numbers >= x, but there are 2.
//If x = 1, there should be 1 number >= x, but there are 0.
//If x = 2, there should be 2 numbers >= x, but there are 0.
//x cannot be greater since there are only 2 numbers in nums.
//Input: nums = [0,4,3,0,4]
//Output: 3
//Explanation: There are 3 values that are greater than or equal to 3.
public class SpecialArrayWithX_elementGreaterThanOrEqualX {
	static int specialArray(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length+1;i++){
            map.put(i,0);
            for(int j =0;j<nums.length;j++){
                if(i<=nums[j]){
                    map.put(i,map.get(i)+1);
                }
            }
            if(i==map.get(i)){
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,4,3,0,4};
		System.out.println(specialArray(nums));
	}

}
