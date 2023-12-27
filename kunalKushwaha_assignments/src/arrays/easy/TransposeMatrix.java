package arrays.easy;

import java.util.Arrays;

//Given a 2D integer array matrix, return the transpose of matrix.
//
//The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's 
//row and column indices.
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [[1,4,7],[2,5,8],[3,6,9]]
public class TransposeMatrix {
    static int[][] transpose(int[][] matrix) {
    	int[][] out=new int[matrix[0].length][matrix.length];
    	for(int i=0;i<matrix.length;i++) {
    		for(int j=0;j<matrix[0].length;j++) {
    			out[j][i]=matrix[i][j];
    		}
    	}
    	return out;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3},{4,5,6}};
		int [][] out =transpose(matrix);
		for(int[] i:out) {
			System.out.println(Arrays.toString(i));
		}
	}

}
