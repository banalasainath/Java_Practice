package arrays.easy;
import java.util.*;
//We have n chips, where the position of the ith chip is position[i].
//
//We need to move all the chips to the same position. In one step, we can change the position 
//of the ith chip from position[i] to:
//
//position[i] + 2 or position[i] - 2 with cost = 0.
//position[i] + 1 or position[i] - 1 with cost = 1.
//Return the minimum cost needed to move all the chips to the same position.

//Input: position = [1,2,3]
//Output: 1
//Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
//Second step: Move the chip at position 2 to position 1 with cost = 1.
//Total cost is 1.
public class MinCostToMoveAllChipsToOnePos {
//	In this problem any large or small odd integer can be placed at position 1 with 0 cost and
//	can place any large or small even integer at 0 position with 0 cost. so we have to decide
//	whether we have to place all the chips at zero or 1st postion by choosing the less number
//	of integers whether they are odd or even which would cost us 1 for every chips from 0 to 1
//	or 1 to 0
	static int minCostToMoveChips(int[] position) {
        int count =0;
        for(int i=0;i<position.length;i++) {
        	if(position[i]%2==0) {
        		count+=1;
        	}
        }
        return Math.min(count, position.length-count);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] position = {1,2,3};
		System.out.println(minCostToMoveChips(position));
	}

}
