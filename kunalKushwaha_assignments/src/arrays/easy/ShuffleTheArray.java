package arrays.easy;

import java.util.Arrays;

//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
//Return the array in the form [x1,y1,x2,y2,...,xn,yn].
//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7]
public class ShuffleTheArray {
	static int[] shuffle(int[] nums, int n) {
		int[] out=new int[2*n];
		int front=0;
		for(int i=0;i<2*n;i+=2) {
			out[i]=nums[front];
			out[i+1]=nums[n+front];
			front++;
		}
        return out;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,1,3,4,7};
		int n=3;
		System.out.println(Arrays.toString(shuffle(nums,n)));
	}

}
