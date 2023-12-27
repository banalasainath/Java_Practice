package arrays.easy;
//Given an array nums of integers, return how many of them contain an even number of digits.
//Input: nums = [12,345,2,6,7896]
//Output: 2
public class NumbersWithEvenNoOfDigits {
    static int findNumbers(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++) {
        	if((Integer.toString(nums[i])).length()%2==0) count+=1;
        }
        return count;
    }	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {12,345,2,6,7896};
		System.out.println(findNumbers(nums));
	}

}
