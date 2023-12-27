package searching.easy;
//You have n coins and you want to build a staircase with these coins. The staircase consists
//of k rows where the ith row has exactly i coins. The last row of the staircase may be 
//incomplete.
//
//Given the integer n, return the number of complete rows of the staircase you will build.
//Input: n = 5
//Output: 2
//Explanation: Because the 3rd row is incomplete, we return 2.		
		
public class ArrangingCoins {
	static int arrangeCoins(int n) {
        int stairs =0;
        int rows=1;
        while(n>=rows){
            stairs+=1;
            n-=rows;
            rows=rows+1;
        }
        return stairs;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		System.out.println(arrangeCoins(n));
	}

}
