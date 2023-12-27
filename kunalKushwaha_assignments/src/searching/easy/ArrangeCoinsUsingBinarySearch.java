package searching.easy;
//You have n coins and you want to build a staircase with these coins. The staircase consists
//of k rows where the ith row has exactly i coins. The last row of the staircase may be 
//incomplete.
//
//Given the integer n, return the number of complete rows of the staircase you will build.
//Input: n = 5
//Output: 2
//Explanation: Because the 3rd row is incomplete, we return 2.	
public class ArrangeCoinsUsingBinarySearch {
	static int arrangeCoins(int num) {
		int start = 1;
		int end = num;
		int ans = 0;
//		In this problem, in the first stair we have one column and in the second stair we have
//		2 colums and in the third 3 cols and so on.
//		By this we can conclude that upto 3 stairs we have 3+2+1=6 no of cols
//		i.e., for n stairs = n+(n-1)+(n-2)+....+1 = n(n+1)/2
//		therefore we just need to check if the total cols for n stairs <=num
		while(start<=end) {
			long mid = start+(end-start)/2;
			long sum = mid*(mid+1)/2;
			if(sum==num) {
				ans = (int)mid;
				break;
			}
			else if(sum<num) {
//			It may be the answer when the stair is incomplete
				ans = (int)mid;
				start =(int)mid+1;
			}
			else {
				end = (int)mid-1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =1804289383;
		System.out.println(arrangeCoins(num));

	}

}
