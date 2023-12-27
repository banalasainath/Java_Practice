package arrays.easy;
import java.util.*;
//Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in 
//any order.
//
//A lucky number is an element of the matrix such that it is the minimum element in 
//its row and maximum in its column.
//Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
//Output: [15]
//Explanation: 15 is the only lucky number since it is the minimum in its row and 
//the maximum in its column.
public class LuckyNumbersInMatrix {
    static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        outer:
        for(int i =0;i<matrix.length;i++) {
        	int min = matrix[i][0];
        	int index =0;
        	for(int j=1;j<matrix[i].length;j++) {
        		if(matrix[i][j]<min) {
        			min = matrix[i][j];
        			index=j;
        		}
        	}
        	for(int k=0;k<matrix.length;k++) {
        		if(matrix[k][index]>min) continue outer;
        	}
        	list.add(min);
        }
        return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
		System.out.println(luckyNumbers(matrix));
	}

}
