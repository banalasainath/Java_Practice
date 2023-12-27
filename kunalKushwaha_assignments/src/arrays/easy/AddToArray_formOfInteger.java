package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//The array-form of an integer num is an array representing its digits in left to right order.
//For example, for num = 1321, the array form is [1,3,2,1].
//Given num, the array-form of an integer, and an integer k, return the array-form of the integer
//num + k.
//Input: num = [1,2,0,0], k = 34
//Output: [1,2,3,4]
//Explanation: 1200 + 34 = 1234
public class AddToArray_formOfInteger {
    static List<Integer> addToArrayForm(int[] num, int k) {
    	List<Integer> list = new ArrayList<>();
    	int index = num.length-1;
    	ArrayList<Integer> arr = new ArrayList<>();
    	int rem=0;
    	while(index>=0 || k!=0 || rem==1) {
    		if (index >=0) {
    			int temp = num[index]+k%10+rem;
    			rem=0;
    			if (temp>=10) {
    				temp=temp-10;
    				rem=1;
    			}
    			arr.add(temp);
    			index-=1;
    		}
    		else {
    			int temp=k%10+rem;
    			rem=0;
    			if (temp>=10) {
    				temp=temp-10;
    				rem=1;
    			}
    			arr.add(temp);
    		}
    		k/=10;
    		
    	}
    	for(int i=arr.size()-1;i>=0;i--) {
    		list.add(arr.get(i));
    	}
    	
    	return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {7};
		int k=993;
		System.out.println(addToArrayForm(num,k));
		
	}

	
}
