package searching.medium;
//There is an integer array nums sorted in ascending order (with distinct values).
//Prior to being passed to your function, nums is possibly rotated at an unknown pivot index 
//k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], 
//nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated 
//at pivot index 3 and become [4,5,6,7,0,1,2].
//Given the array nums after the possible rotation and an integer target, return the index of 
//target if it is in nums, or -1 if it is not in nums.
//You must write an algorithm with O(log n) runtime complexity.
//Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
public class SearchInARotatedArray {
	static int findIndex(int[] nums,int target) {
		int pivot = findPivot(nums);
		if(pivot==-1) {
			return binarySearch(nums,target,0,nums.length-1);
		}
		if(target>=nums[0]) {
			return binarySearch(nums,target,0,pivot);
		}
		else {
			return binarySearch(nums,target,pivot+1,nums.length-1);
		}
	}
	static int findPivot(int[] nums) {
		int start =0;
		int end = nums.length-1;
		while(start<=end) {
			int mid = start+(end- start)/2;
			if(mid>start && nums[mid]<nums[mid-1]) {
				return mid-1;
			}
			else if(mid<end && nums[mid]>nums[mid+1]) {
				return mid;
			}
			else if(nums[start]>=nums[mid]) {
				end=mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return -1;
	}
	static int binarySearch(int[] nums,int target,int start,int end) {
		while(start<=end) {
			int mid = start+(end-start)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]>target) {
				end =mid-1;
			}
			else {
				start = mid+1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1};
		int target = 1;
		System.out.println(findIndex(nums,target));
	}

}
