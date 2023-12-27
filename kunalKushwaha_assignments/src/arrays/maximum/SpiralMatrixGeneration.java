package arrays.maximum;
import java.util.*;
//Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 
//in spiral order.
//Input: n = 3
//Output: [[1,2,3],[8,9,4],[7,6,5]]
public class SpiralMatrixGeneration {
    static int[][] generateMatrix(int n) {
        int[][] output = new int[n][n];
        int row_start =0;
        int row_end = n-1;
        int col_start = 0;
        int col_end = n-1;
        int row=0;
        int col=0;
        int count =1;
        int value =0;
        while(count<=n*n) {
        	switch(value) {
        	case 0:{
        		for(col=col_start;col<=col_end;col++) {
        			output[row][col]=count;
        			count++;
        		}
        		col=col_end;
        		row_start++;
        		value++;
        		break;
        	}
        	case 1:{
        		for(row=row_start;row<=row_end;row++) {
        			output[row][col]=count;
        			count++;
        		}
        		row=row_end;
        		col_end--;
        		value++;
        		break;
        	}
        	case 2:{
        		for(col=col_end;col>=col_start;col--) {
        			output[row][col]=count;
        			count++;
        		}
        		col=col_start;
        		row_end--;
        		value++;
        		break;
        	}
        	case 3:{
        		for(row=row_end;row>=row_start;row--) {
        			output[row][col]=count;
        			count++;
        		}
        		row=row_start;
        		col_start++;
        		value=0;
        		break;
        	}
        	}
        }
        return output;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int[][] Spiral_Matrix = generateMatrix(n);
		for(int[] mat:Spiral_Matrix) {
			System.out.println(Arrays.toString(mat));
		}
	}

}
