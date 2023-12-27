package javaFundamentals.flowCtrl;
import java.util.*;
//To find whether the given integer is positive,negative or zero
public class PosOrNegInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        if(n>0){
        	System.out.println(n+" is positive");
        }
        else if(n<0) {
        	System.out.println(n+" is negative");
        }
        else System.out.println(n+" is equal to zero");
        
	}

}
