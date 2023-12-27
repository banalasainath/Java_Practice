package arrays.easy;

import java.util.Arrays;

//where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//Given an integer array nums of length n,you want to create an array ans of length 2n 
//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
public class ConcatenationOfArrays {
	static int[] getConcatenation(int[] nums) {
        int[] out=new int[nums.length<<1];
        System.arraycopy(nums,0,out,0,nums.length);
        //arraycopy(source_array,starting_ind_src,dest_arr,starting_pos_dest_arr_where to copy,
        //total no. of components to be copied)
        System.arraycopy(nums,0,out,nums.length,nums.length);
        return out;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,1};
		System.out.println(Arrays.toString(getConcatenation(nums)));
		
	}

}
