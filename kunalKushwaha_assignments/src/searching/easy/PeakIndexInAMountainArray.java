package searching.easy;
//An array arr a mountain if the following properties hold:
//arr.length >= 3
//There exists some i with 0 < i < arr.length - 1 such that:
//arr[0] < arr[1] < ... < arr[i - 1] < arr[i] 
//arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
//Given a mountain array arr, return the index i such that 
//arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
//You must solve it in O(log(arr.length)) time complexity.
//Input: arr = [0,2,1,0]
//Output: 1
public class PeakIndexInAMountainArray {
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
        	int mid = start+(end-start)/2;
        	if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
        		return mid;
        	}
        	else if(arr[mid]>arr[mid-1]) {
        		start = mid+1;
        	}
        	else {
        		end = mid-1;
        	}
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,2,1,0};
		System.out.println(peakIndexInMountainArray(arr));
	}

}
