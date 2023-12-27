package first.Java;
import java.util.*;
public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n= sc.nextInt();
		if(n%2==0) System.out.println("Entered number is even");
		else System.out.println("Entered number is odd");
	}

}
