package arrays.easy;
//Given a square matrix mat, return the sum of the matrix diagonals.
//Only include the sum of all the elements on the primary diagonal and all the elements on the 
//secondary diagonal that are not part of the primary diagonal.
//Input: mat = [[1,2,3],
//              [4,5,6],
//              [7,8,9]]
//Output: 25
//Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
//Notice that element mat[1][1] = 5 is counted only once.
public class MatrixDiagonalSum {
    static int diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;i++) {
        	if (mat.length%2!=0 && i==(mat.length/2))sum+=mat[i][i];
        	else sum+=(mat[i][i]+mat[i][mat.length-i-1]);
        }
        return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(diagonalSum(mat));
	}

}
