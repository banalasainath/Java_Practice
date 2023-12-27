package practiceProblems;

public class MostOccurInArray {
	static int findIndex(int[] arr) {
		int index=arr.length;
		int[] count=new int[arr.length];
		int max=0;
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<=i;j++) {
				if(arr[i]==arr[j]) {
					count[i]+=1;
				}
			}
			if(count[i]>max) {
				max=count[i];
			}
		}
		for (int j=arr.length-1;j>=0;j--) {
			if(count[j]==max && j<index) {
				index=j;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,4,7,4,7};
		System.out.println(findIndex(arr));
	}

}
