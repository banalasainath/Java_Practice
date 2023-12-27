package practiceProblems;
import java.util.*;
public class MessageEncoding {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the message to be encoded :");
		String s=sc.next();
		System.out.print("Enter the key :");
		String key = sc.next();
		String out="";
		int j=0;
		for(int i=0;i<s.length();i++) {
			if (j==key.length()) {
				j=0;
			}
			if(i!=s.length()-1) {
			out+=String.valueOf((int)(s.charAt(i))+(int)(key.charAt(j))-96-48)+",";
			j+=1;
			}
			else {
				out+=String.valueOf((int)(s.charAt(i))+(int)(key.charAt(j))-96-48);
			}
		}
		System.out.println(out);
	}
}
