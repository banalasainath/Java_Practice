package first.Java;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principle amount: ");
		int principle_amount=sc.nextInt();
		System.out.print("Enter the Period of time in no of months: ");
		int time=sc.nextInt();
		System.out.print("Enter the Rate of Interest :");
		int rate=sc.nextInt();
		float simple_interest;
		simple_interest=(principle_amount*time*rate)/100;
		System.out.println("The simple interest for the given values is: "+simple_interest);
		
	}

}
