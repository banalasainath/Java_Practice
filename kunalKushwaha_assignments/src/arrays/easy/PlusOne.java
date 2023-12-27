package arrays.easy;

import java.util.Arrays;

//You are given a large integer represented as an integer array digits, where each 
//digits[i] is the ith digit of the integer. The digits are ordered from most 
//significant to least significant in left-to-right order. The large integer does not 
//contain any leading 0's.
//
//Increment the large integer by one and return the resulting array of digits.

//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
		
public class PlusOne {
    static int[] plusOne(int[] digits) {
    	int rem =0;
    	if(digits[digits.length-1]+1==10) {
    		digits[digits.length-1]=0;
    		rem=1;
    		int index = digits.length-2;
    		while(rem==1&&index!=-1) {
            	if(digits[index]+rem==10) {
            		rem=1;
            		digits[index]=0;
            	}
            	else {
            		digits[index]=digits[index]+rem;
            		return digits;
            	}
            	index-=1;
            }
    		if(index==-1) {
    			int[] out = new int[digits.length+1];
    			out[0]=1;
    			for(int i=0;i<digits.length;i++) {
    				out[i+1]=digits[i];
    			}
    			return out;
    		}
    	}
    	digits[digits.length-1]+=1;
    	return digits;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {9,9,9};
		System.out.println(Arrays.toString(plusOne(digits)));
	}

}
