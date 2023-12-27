package first.Java;
import java.util.*;
public class ArithmeticOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a=sc.nextInt();
		System.out.print("Enter the second number: ");
		int b=sc.nextInt();
		System.out.print("Enter the operator: ");
		char ch=sc.next().trim().charAt(0);
		if(ch=='+') System.out.println("The addition of two numbers is: "+ (a+b));
		else if(ch=='-') System.out.println("The subtraction of two numbers is: "+ (a-b));
		else if(ch=='*') System.out.println("The multiplication of two numbers is: "+ (a*b));
		else if(ch=='/') System.out.println("The division of two numbers is: "+ (double)(a/b));
		else System.out.println("You have entered an invalid input");
		
	}

}
