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
public class SquareRootWithoutBuiltIn {
    static int mySqrt(int x) {
    	int ans=0;
    	for(int i =1;i<=x/2+1;i++) {
    		int square = i*i;
    		if(square ==x) {
    			ans=i;
    			break;
    		}
    		else if(square>x){
    			ans =i-1;
    			break;
    		}
    		else if(square>=2147395600) {
    			ans=46340;
    			break;
    		}
    		
    	}
    	return ans;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long x = 46341*46341;
		
		System.out.println((long)((long)46341*46341));
		
	}

}
