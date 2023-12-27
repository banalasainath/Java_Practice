package arrays.easy;
//You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates 
//the birth and death years of the ith person.
//The population of some year x is the number of people alive during that year. The ith person 
//is counted in year x's population if x is in the inclusive range [birthi, deathi - 1]. 
//Note that the person is not counted in the year that they die.
//Return the earliest year with the maximum population.

//Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
//Output: 1960
//Explanation: 
//The maximum population is 2, and it had happened in years 1960 and 1970.
//The earlier year between them is 1960.
public class MaxPopulationYear {
    static int maximumPopulation(int[][] logs) {
        int year=-1;
        int[] years = new int[101];
        for(int i =0 ;i<logs.length;i++) {
        	for(int j=logs[i][0];j<logs[i][1];j++) {
        		years[j-1950]+=1;
        	}
        }
        int count =0;
        for(int i=0;i<101;i++) {
        	if(years[i]>count) {
        		count=years[i];
        		year=i+1950;
        	}
        }
        return year;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] age = {{1950,1961},{1960,1971},{1970,1981}};
		System.out.println(maximumPopulation(age));
	}

}
