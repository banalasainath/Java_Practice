package arrays.maximum;
import java.util.*;
//Given an m x n matrix, return all elements of the matrix in spiral order.
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]
public class SpiralMatrix {
    static List<Integer> spiralOrder(int[][] matrix) {
     List<Integer> list = new ArrayList<Integer>();
     int row_start = 0;
     int col_start =0;
     int row_end= matrix.length-1;
     int col_end =matrix[0].length-1;
     int row=0;
     int col=0;
     int value =1;
     while(list.size()!=matrix.length*matrix[0].length) {
    	 switch(value) {
    	 	case 1: {
	    		 for(col=col_start;col<=col_end;col++) {
	    			 list.add(matrix[row][col]);
	    		 }
	    		 row_start++;
	    		 col=col_end;
	    		 value++;
	    		 break;
	    	 }
    	 	case 2: {
	    		 for(row=row_start;row<=row_end;row++) {
	    			 list.add(matrix[row][col]);
	    		 }
	    		 col_end--;
	    		 row=row_end;
	    		 value++;
	    		 break;
	    	 }
    	 	case 3: {
	    		 for(col=col_end;col>=col_start;col--) {
	    			 list.add(matrix[row][col]);
	    		 }
	    		 row_end--;
	    		 col=col_start;
	    		 value++;
	    		 break;
	    	 }
    	 	case 4: {
	    		 for(row=row_end;row>=row_start;row--) {
	    			 list.add(matrix[row][col]);
	    		 }
	    		 col_start++;
	    		 row=row_start;
	    		 value=1;
	    		 break;
    	 
    	 	}
    	 }
    	 
     }
     return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println(spiralOrder(matrix));
	}

}
