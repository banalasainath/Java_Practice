package arrays.easy;

import java.util.Arrays;

//In MATLAB, there is a handy function called reshape which can reshape an 
//m x n matrix into a new one with a different size r x c keeping its original data.
//
//You are given an m x n matrix mat and two integers r and c representing the 
//number of rows and the number of columns of the wanted reshaped matrix.
//
//The reshaped matrix should be filled with all the elements of the original matrix 
//in the same row-traversing order as they were.
//
//If the reshape operation with given parameters is possible and legal, output the 
//new reshaped matrix; Otherwise, output the original matrix.
//Input: mat = [[1,2],[3,4]], r = 1, c = 4
//Output: [[1,2,3,4]]

//Input: mat = [[1,2],[3,4]], r = 2, c = 4
//Output: [[1,2],[3,4]]
public class ReshapeMatrix {
    static int[][] matrixReshape(int[][] mat, int r, int c) {
       if(r*c==mat.length*mat[0].length) {
    	   int[][] reshape = new int[r][c];
    	   int row = 0;
    	   int col=0;
    	   for(int i=0;i<mat.length;i++) {
    		   for(int j=0;j<mat[0].length;j++) {
    			   reshape[row][col]=mat[i][j];
    			   if(col==c-1) {
    				   row+=1;
    				   col=0;
    			   }
    			   else {
    				   col+=1;
    			   }
    		   }
    	   }
    	   return reshape;
       }
       return mat;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1,2},{3,4}};
		int row = 2;
		int col = 4;
		int[][] reshape = matrixReshape(mat,row,col);
		for(int[] i: reshape) {
			System.out.println(Arrays.toString(i));
		}
	}

}
