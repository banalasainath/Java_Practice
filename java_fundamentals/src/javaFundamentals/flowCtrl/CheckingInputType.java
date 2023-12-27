package javaFundamentals.flowCtrl;
import java.util.*;
public class CheckingInputType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the char input to verify whether it is alphabet or digit or a special"
        		+ " character :");
        String s=sc.next();
        /*if(s.matches("[a-zA-Z]+")) {
        	System.out.println("The entered value is an alphabet");
        }
        else if (s.matches("-?\\d+(\\.\\d+)?")){
        	System.out.print("The entered value is a digit");
        }
        else {
        	System.out.println("The entered value is a special Character");
        }*/
        /*the above method is used to check whether the input is a string when the input is a char
         * the below mentioned can be used
         */
        if((Character.isDigit(s.charAt(0)))){
        	System.out.println("The entered input is a digit");
        }
        else if(Character.isAlphabetic(s.charAt(0))) {
        	System.out.println("The entered input is an alphabet");
        }
        else {
        	System.out.println("The entered input is a special character");
        }
	}

}
