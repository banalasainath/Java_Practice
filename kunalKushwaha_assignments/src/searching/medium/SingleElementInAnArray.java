package searching.medium;
//You are given a sorted array consisting of only integers where every element appears exactly 
//twice, except for one element which appears exactly once.
//Return the single element that appears only once.
//Your solution must run in O(log n) time and O(1) space.
//Input: nums = [1,1,2,3,3,4,4,8,8]
//Output: 2
public class SingleElementInAnArray {
    static int singleNonDuplicate(int[] nums) {
        int start =0;
        int end = nums.length-1;
        if(nums.length==1) {
        	return nums[start];
        }
        if(nums[start]!=nums[start+1]) {
        	return nums[start];
        }
        if(nums[end]!=nums[end-1]) {
        	return nums[end];
        }
        while(start<=end) {
        	int mid = start+(end-start)/2;
        	if((nums[mid]!=nums[mid-1])&&(nums[mid]!=nums[mid+1]) ) {
        		return nums[mid];
        	}
//        	before single element every new number will start with even no. index and repeat 
//        	number is at odd index.if we get such type of index then the single element will
//        	be at the right side
        	else if((mid%2==0 && nums[mid]==nums[mid+1])||
        			(mid%2==1 && nums[mid]==nums[mid-1])) {
        		start =mid+1;
        	}
//        	after single element every new number starts at odd index and the repeat number
//        	will be at even index, if we get such type of index then the single element will
//        	at the left side
        	else {
        		end = mid-1;
        	}	
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,1,2,3,3,4,4,8,8};
		System.out.println(singleNonDuplicate(nums));
	}

}
