package searching.easy;
//Given an array arr of positive integers sorted in a strictly increasing order, and an 
//integer k.
//Return the kth positive integer that is missing from this array.
//Input: arr = [2,3,4,7,11], k = 5
//Output: 9
//Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. 
//The 5th missing positive integer is 9.
//Input: arr = [1,2,3,4], k = 2
//Output: 6
//Explanation: The missing positive integers are [5,6,7,...]. 
//The 2nd missing positive integer is 6.
public class KthMissingPositiveInteger {
    static int findKthPositive(int[] arr, int k) {
    	int start = 0;
    	int end = arr.length-1;
        if(arr[0]>k) {
        	return k;
        }
        while(start<=end) {
        	int mid = start+(end-start)/2;
        	if(arr[mid]-(mid+1)>=k) {
        		end = mid-1;
        	}
        	else {
        		start = mid+1;
        	}
        }
        start--;
//      Here we are adding the value of (the missing index -total numbers missed upto the 
//      start index value) to the start-- index which pointing to the integer less than the 
//      missing index integer value  
        return arr[start]+(k-(arr[start]-(start+1)));
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,7,11};
		int k =8;
		System.out.println(findKthPositive(arr,k));
	}

}
