package arrays.maximum;
import java.util.*;
//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column 
//to 0's.
//You must do it in place.
//Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
//Output: [[1,0,1],[0,0,0],[1,0,1]]
public class SetMatrixZeroes {
    static void setZeroes(int[][] matrix) {
        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();
        for(int i=0;i<matrix.length;i++) {
        	for(int j=0;j<matrix[0].length;j++) {
        		if(matrix[i][j]==0) {
        			 row.add(i);
        			 col.add(j);
        		}
        	}
        }
        for(int i=0;i<row.size();i++) {
        	for(int j=0;j<matrix[0].length;j++) {
        		matrix[row.get(i)][j]=0;
        	}
        	for(int k=0;k<matrix.length;k++) {
        		matrix[k][col.get(i)]=0;
        	}
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
		setZeroes(matrix);
		for(int[] x:matrix) {
			System.out.println(Arrays.toString(x));
		}
	}

}
