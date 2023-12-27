package javaFundamentals.flowCtrl;
import java.util.*;
public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to Verify :");
		int n = sc.nextInt();
		if(n==0){
			System.out.println(n+" is zero");
		}
		else if(n%2==0){
			System.out.println(n+" is Even");
		}
		else {
			System.out.println(n+" is Odd");
		}
	}

}
