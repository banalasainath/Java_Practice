package searching.easy;
import java.util.*;
//Alice and Bob have a different total number of candies. You are given two integer arrays 
//aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy
//that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.
//Since they are friends, they would like to exchange one candy box each so that after the 
//exchange, they both have the same total amount of candy. The total amount of candy a person 
//has is the sum of the number of candies in each box they have.
//Return an integer array answer where answer[0] is the number of candies in the box that Alice
//must exchange, and answer[1] is the number of candies in the box that Bob must exchange. If 
//there are multiple answers, you may return any one of them. It is guaranteed that at least 
//one answer exists.
//Input: aliceSizes = [1,1], bobSizes = [2,2]
//Output: [1,2]
//Input: aliceSizes = [2], bobSizes = [1,3]
//Output: [2,3]
//Approach
//given that the problem has at least one solution such that the sum of the candies at alice is 
//is equal to the sum of the candies at bob after exchanging.consider an element x at alice
//and element y at bob which are meant for exchanging then we can get equation this is:
//sum(alice)-x(exchanged with bob)+y(received from bob)=sum(bob)-y+x
//y=x+(sum(bob)-sum(alice))/2 , which indicates the element to be given to alice to equal the candies  
public class FairCandySwap {
    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int alice_Candies =0;
        int bob_Candies=0;
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<aliceSizes.length;i++) {
        	alice_Candies+=aliceSizes[i];
        }
        for(int i=0;i<bobSizes.length;i++) {
        	bob_Candies+=bobSizes[i];
        	set.add(bobSizes[i]);
        }
        int diff = (bob_Candies-alice_Candies)/2;
        for(int i=0;i<aliceSizes.length;i++) {
        	if(set.contains(aliceSizes[i]+diff)) {
        		return new int[] {aliceSizes[i],aliceSizes[i]+diff};
        	}
        }
        return new int[] {-1,-1}; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aliceSizes = {1,1};
		int[] bobSizes = {2,2};
		System.out.println(Arrays.toString(fairCandySwap(aliceSizes,bobSizes)));
	}

}
