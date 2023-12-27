package searching.easy;
//We are playing the Guess Game. The game is as follows:
//I pick a number from 1 to n. You have to guess which number I picked.
//Every time you guess wrong, I will tell you whether the number I picked is higher or 
//lower than your guess.
//You call a pre-defined API int guess(int num), which returns three possible results:
//-1: Your guess is higher than the number I picked (i.e. num > pick).
//1: Your guess is lower than the number I picked (i.e. num < pick).
//0: your guess is equal to the number I picked (i.e. num == pick).
//Return the number that I picked.
//Input: n = 10, pick = 6
//Output: 6
public class GuessingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(guess(10));

	}
	static int guessValuation(int num) {
		int guess =6;
		int ans=Integer.MIN_VALUE;
		if(num==guess) {
			ans= 0;
		}
		else if(num>guess) {
			ans= -1;
		}
		else {
			ans = 1;
		}
		return ans;
	}
	static int guess(int range) {
		int start = 1;
        int end = range;
        int ans=0;
        while(start<=end){
            int mid = start+(end-start)/2;
            
            if(guessValuation(mid)==0){
                return mid;
            }
            else if(guessValuation(mid)==-1){
                end=mid-1;
            }
            else{
                start =mid+1;
            }
        }
        return ans;
	}

}
