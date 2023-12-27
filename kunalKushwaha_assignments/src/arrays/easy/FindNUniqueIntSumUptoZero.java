package arrays.easy;
import java.util.*;
//Given an integer n, return any array containing n unique integers such that they 
//add up to 0.
//Input: n = 5
//Output: [-7,-1,1,3,4]
//Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].
public class FindNUniqueIntSumUptoZero {
    static int[] sumZero(int n) {
        int[] out = new int[n];
        for(int i=0;i<n/2;i++) {
        	out[i]=(n/2-i);
        	out[n-i-1]=-(n/2-i);
        }
        if(n%2!=0) out[n/2]=0;
        return out;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(Arrays.toString(sumZero(n)));
	}

}
