package arrays.easy;
//Given an array of integers nums, return the number of good pairs.
//A pair (i, j) is called good if nums[i] == nums[j] and i < j.
//Input: nums = [1,2,3,1,1,3]
//Output: 4
//Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
public class NoOfGoodPairs {
	static int numIdenticalPairs(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
		}
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,1,1,3};
		System.out.println("No of Good pairs in the given array is: "+numIdenticalPairs(nums));
	}

}
