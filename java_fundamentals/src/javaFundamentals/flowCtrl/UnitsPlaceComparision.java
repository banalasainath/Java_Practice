package javaFundamentals.flowCtrl;
// program to find whether the units place of two input integers are same or not
import java.util.*;
public class UnitsPlaceComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer :");
        String s1=sc.next();
        System.out.print("Enter the second integer :");
        String s2 = sc.next();
        if(s1.charAt(s1.length()-1)==s2.charAt(s2.length()-1)) {
        	System.out.println(s1+" and "+s2+" are ending with the same integers");
        }
        else {
        	System.out.println(s1+" and "+s2+" are not ending with the same integers");
        }
	}

}
