package searching.medium;

import java.util.Arrays;

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending 
//position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
public class FirstAndLastIndexOfAnElement {
	static int[] searchRange(int[] nums, int target ) {
        int[] ans = {-1,-1};
        ans[0] = index(nums,target,true);
        ans[1]=index(nums,target,false);
        return ans;
    }
	static int index(int[] nums,int target,boolean find_start) {
		int ans = -1;
		int start = 0;
		int end = nums.length-1;
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(nums[mid]<target) {
				start = mid+1;
			}
			else if(nums[mid]>target) {
				end= mid-1;
			}
			else {
				ans = mid;
				if(find_start) {
					end=mid-1;
				}
				else {
					start = mid+1;
				}
			}		
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,7,7,8,8,10};
		int target=8;
		System.out.println(Arrays.toString(searchRange(nums,target)));
	}

}
