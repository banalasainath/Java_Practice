package searching.easy;
//Given a sorted array of distinct integers and a target value, return the index if the 
//target is found. If not, return the index where it would be if it were inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
//Input: nums = [1,3,5,6], target = 2
//Output: 1
//Input: nums = [1,3,5,6], target = 5
//Output: 2
public class SearchInsertPosition {
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
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
        return end +1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,5,6};
		int target = 2;
		System.out.println(searchInsert(nums,target));
	}

}
