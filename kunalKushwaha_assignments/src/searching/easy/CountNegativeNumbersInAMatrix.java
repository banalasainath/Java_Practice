package searching.easy;
//Given a m x n matrix grid which is sorted in non-increasing order both row-wise and 
//column-wise, return the number of negative numbers in grid.
//Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//Output: 8
////Explanation: There are 8 negatives number in the matrix.
public class CountNegativeNumbersInAMatrix {
    static int countNegatives(int[][] grid) {
        int count =0;
        for(int i =0;i<grid.length;i++) {
        	int start = 0;
        	int end = grid[i].length-1;
        	if(grid[i][0]<0) {
        		count+=end+1;//add the total row size to the count if the first element is<0 i.e., negative
        		continue;
        	}
        	while(start<=end) {
        		int mid = start+(end-start)/2;
        		if(grid[i][mid]<0 && (mid>start &&grid[i][mid-1]>=0)) {
        			count+=grid[i].length-mid;//No of negative elements from mid
        			break;
        		}
        		else if(grid[i][mid]>=0 && ((mid<end)&&grid[i][mid+1]<0)){
        			count+=grid[i].length-(mid+1);//No of negative elements from mid+1
        			break;
        		}
        		else if(grid[i][mid]>=0) {
        			start = mid+1;
        		}
        		else {
        			end = mid-1;
        		}
        	}
        }
        return count;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = {{0,-3,-3,-3,-3}};
		System.out.println(countNegatives(grid));
	}

}
