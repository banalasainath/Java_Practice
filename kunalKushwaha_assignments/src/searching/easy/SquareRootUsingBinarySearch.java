package searching.easy;
//Given a non-negative integer x, return the square root of x rounded down to the nearest 
//integer. The returned integer should be non-negative as well.
//
//You must not use any built-in exponent function or operator.
//
//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
//Input: x = 4
//Output: 2
//Explanation: The square root of 4 is 2, so we return 2.
public class SquareRootUsingBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 5;
		System.out.println(mySqrt(x));
	}
	static int mySqrt(int x) {
        long start =1;
        long end = x;
        int ans = 0;
        while(start<=end) {
        	long mid = start+(end-start)/2;
        	if(mid*mid==x ) {
        		ans=(int) mid;
        		break;
        	}
        	else if(mid*mid>x) {
        		end = mid-1;
        	}
        	else {
        		ans=(int)mid;
        		start =mid+1;
        	}
        }
        return ans;
    }

}
