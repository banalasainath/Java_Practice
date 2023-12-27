package practiceProblems;
import java.util.*;
public class RemoveDuplicates {
	public static int ArrayChallange(int[] arr) {
		int[] arr1= new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			int flag=0;
			
			for(int j=0;j<index;j++) {
				if(arr[i]==arr1[j]) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				arr1[index]=arr[i];
				index+=1;
			}	
		}
		return arr.length-index;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
//		gives how many duplicates in an array
		int[] arr = new int[] {1,2,3,4,3,3};
		System.out.println(ArrayChallange(arr));
		sc.close();
	}

}
