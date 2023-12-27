package practiceProblems;

public class BinSearch {
	
	static int binarySearch(int arr[] ,int n, int k) {
		int start =0;
		int end= arr.length-1;
		while (start<=end) {
			int midpoint = (start+end)/2;
			if(arr[midpoint]==k) {
				return midpoint;
			}
			midpoint = (int)(start+end)/2;
			if(k<arr[midpoint]) {
				end=midpoint-1;
			}
			else {
				start=midpoint+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,8,9,10,14,16,19,22,23,25,26,27,29,31,34,35,36,38,39,40,45,46,48,50,51,52,57,59,60,61,63,67,68,69,71,75,76,77,79,81,82,83,86,87,88,90,92,93,94,95,96,98,99,100};
		int n =59;
		int k=93;
		System.out.println(binarySearch(arr,n,k));
	}

}
