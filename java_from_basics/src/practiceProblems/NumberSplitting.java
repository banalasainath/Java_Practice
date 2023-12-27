package practiceProblems;
import java.util.*;
public class NumberSplitting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to be split :");
		String s= sc.next();
		String out="";
		for(int i=0;i<s.length();i++) {
			if(i!=s.length()-1) {
				int x=(int)(Character.getNumericValue(s.charAt(i))*(Math.pow(10,s.length()-i-1)));
				out+=String.valueOf(x)+"+";
			}
			else {
				int x=(int)(Character.getNumericValue(s.charAt(i))*(Math.pow(10,s.length()-i-1)));
				out+=String.valueOf(x);
			}
		}
		System.out.println(out);
		sc.close();
	}

}
