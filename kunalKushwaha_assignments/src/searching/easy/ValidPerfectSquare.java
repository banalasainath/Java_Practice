package searching.easy;
//Given a positive integer num, write a function which returns True if num is a perfect square 
//else False.
//Follow up: Do not use any built-in library function such as sqrt.
//Input: num = 16
//Output: true
public class ValidPerfectSquare {
    static boolean isPerfectSquare(int num) {
        long start=1;
        long end = num;
        while(start<=end) {
        	long mid = start+(end-start)/2;
        	if(mid*mid ==num ) {
        		return true;
        	}
        	else if(mid*mid <num) {
        		start = mid+1;
        	}
        	else {
        		end = mid-1;
        	}
        }
        return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 2147483647;
		System.out.println(isPerfectSquare(num));
	}

}
