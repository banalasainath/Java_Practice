package practiceProblems;
import java.util.*;
public class FindItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr=new int[N];
		for(int i=0; i<N;i++) {
			arr[i]=sc.nextInt();
		}
		int K = sc.nextInt();
		for(int i =0;i<N;i++) {
			if(arr[i]==K) {
				System.out.println(i);
				break;
			}
		}
	}

}
