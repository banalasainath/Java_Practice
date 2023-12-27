package arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//There are n kids with candies. You are given an integer array candies, where each candies[i] 
//represents the number of candies the ith kid has, and an integer extraCandies, denoting 
//the number of extra candies that you have.
//Return a boolean array result of length n, where result[i] is true if, after giving the ith kid 
//allthe extraCandies, they will have the greatest number of candies among all the kids,
//or false otherwise.
//Note that multiple kids can have the greatest number of candies.
//Input: candies = [2,3,5,1,3], extraCandies = 3
//Output: [true,true,true,false,true]

public class KidsWithGreatestNumberOfCandies {
	static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> out = new ArrayList<>();
		int max=Arrays.stream(candies).max().getAsInt();
		for(int i=0;i<candies.length;i++) {
			if(candies[i]+extraCandies>=max) out.add(true);
			else out.add(false);
		}
        return out;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candies= {2,3,5,1,3};
		int extraCandies=3;
		System.out.print(kidsWithCandies(candies,extraCandies));
	}

}
