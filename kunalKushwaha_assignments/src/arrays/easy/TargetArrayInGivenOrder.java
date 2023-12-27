package arrays.easy;

import java.util.Arrays;

//Given two arrays of integers nums and index. Your task is to create target array 
//under the following rules:
//Initially target array is empty.
//From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] 
//in target array.
//Repeat the previous step until there are no elements to read in nums and index.
//Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
//Output: [0,4,1,3,2]
//[0]
//[0,1]
//[0,1,2]
//[0,1,3,2]
//[0,4,1,3,2]
public class TargetArrayInGivenOrder {
	static int[] createTargetArray(int[] nums, int[] index) {
		int[] target= new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			if (index[i]<=nums.length-1 && i!=0) {
				for(int j=nums.length-2;j>=index[i];j--) {
					target[j+1]=target[j];
				}
			}
			System.out.println("before: "+Arrays.toString(target));
			target[index[i]]=nums[i];
			System.out.println(Arrays.toString(target));
		}
		return target;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,0};
		int[] index = {0,1,2,3,0};
		System.out.println(Arrays.toString(createTargetArray(nums,index)));
	}

}
