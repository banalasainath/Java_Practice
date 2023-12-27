package arrays.easy;

import java.util.Arrays;

//Given two n x n binary matrices mat and target, return true if it is possible to make mat equal to target
//by rotating mat in 90-degree increments, or false otherwise.
//Input: mat = [[0,1],[1,1]], target = [[1,0],[0,1]]
//Output: false
//Explanation: It is impossible to make mat equal to target by rotating mat.
public class IfMatCanBeObtainedByRotated {
    static boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++) {
        	if(check(mat,target)) return true;
        	rotate(mat);
        }
        return false;
    }
    static void  rotate(int[][] mat){
//    	For rotating a matrix 90 degree we need to first transpose the matrix
//    	then swapping element of 0th coloumn with n-1 coloumn , 
//    	1st col with n-2 col and so on 
    	for(int i=0;i<mat.length;i++) {
    		for(int j=i;j<mat.length;j++) {
    			int temp=mat[i][j];
    			mat[i][j]=mat[j][i];
    			mat[j][i]=temp;
    		}
    	}
//    	swapping elements
    	for(int i =0;i<mat.length;i++) {
    		for(int j=0;j<mat.length/2;j++) {
    			int temp=mat[i][j];
    			mat[i][j]=mat[i][mat.length-1-j];
    			mat[i][mat.length-1-j]=temp;
    		}
    	}
    }
    static boolean check(int[][] mat,int[][] target) {
    	for(int i=0;i<mat.length;i++) {
    		for(int j=0;j<mat.length;j++) {
    			if(mat[i][j]!=target[i][j]) return false;
    		}
    	}
    	return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
		int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
		System.out.println(findRotation(mat,target));
		
	}

}
