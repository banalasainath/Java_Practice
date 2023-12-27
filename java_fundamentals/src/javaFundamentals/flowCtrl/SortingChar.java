package javaFundamentals.flowCtrl;
import java.util.*;
import java.util.Arrays;
public class SortingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the characters seperated without space :");
		char ch[]=sc.next().toCharArray();
		Arrays.sort(ch);
		for(char c:ch) {
			System.out.print(c+" ");
		}
	}

}
