package searching.easy;
import java.util.*;
//Given an array arr of integers, check if there exist two indices i and j such that :
//i != j
//0 <= i, j < arr.length
//arr[i] == 2 * arr[j]
//Input: arr = [10,2,5,3]
//Output: true
//Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
//Input: arr = [3,1,7,11]
//Output: false
//Explanation: There is no i and j that satisfy the conditions.
public class CheckIf_N_And_Its_DoubleExists {
    static boolean checkIfExist(int[] arr) {
    	Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++) {
        	map.put(arr[i],i);
        }
        for(int i =0;i<arr.length;i++) {
        	if(map.containsKey(2*arr[i]) && map.get(2*arr[i])!=i) {
        		return true;
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,2,5,3};
		System.out.println(checkIfExist(arr));
	}

}
