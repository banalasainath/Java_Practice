package arrays.easy;

import java.util.Arrays;

//There is an m x n matrix that is initialized to all 0's. There is also a 2D array indices where
//each indices[i] = [ri, ci] represents a 0-indexed location to perform some increment operations on
//the matrix.
//For each location indices[i], do both of the following:
//Increment all the cells on row ri.
//Increment all the cells on column ci.
//Given m, n, and indices, return the number of odd-valued cells in the matrix after applying 
//the increment to all locations in indices.
//Input: m = 2, n = 3, indices = [[0,1],[1,1]]
//Output: 6
//Explanation: Initial matrix = [[0,0,0],[0,0,0]].
//After applying first increment it becomes [[1,2,1],[0,1,0]].
//The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.
public class CellsWithOddValuesInMatrix {
    static int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        int count=0;
        for(int[] x:indices) {
        	row[x[0]]+=1;
        	col[x[1]]+=1;
        }
        for(int i=0;i<m;i++) {
        	for(int j=0;j<n;j++) {
        		if((row[i]+col[j])%2!=0) count+=1;
        	}
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=2;
		int n=3;
		int[][] indices = {{0,1},{1,1}};
		System.out.println(oddCells(m,n,indices));
	}

}
