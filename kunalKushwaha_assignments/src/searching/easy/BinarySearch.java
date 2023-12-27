package searching.easy;
//Given an array of integers nums which is sorted in ascending order, and an integer target, 
//write a function to search target in nums. If target exists, then return its index. Otherwise,
//return -1.
//You must write an algorithm with O(log n) runtime complexity.
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
public class BinarySearch {
	static int search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        while(start<=end) {
        	int mid = start+(end-start)/2;
        	if(nums[mid]==target) {
        		return mid;
        	}
        	else if(nums[mid]<target) {
        		start = mid+1;
        	}
        	else {
        		end = mid-1;
        	}
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,3,5,6,7};
		int target = 4;
		System.out.println(search(nums,target));
	}

}
