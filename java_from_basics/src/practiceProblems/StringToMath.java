package practiceProblems;
import java.util.*;
public class StringToMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String [] str =s.trim().split("[ !,?._'@]+");
		if (s.trim().isEmpty()) {
			System.out.println("0");
		}
		else {
			System.out.println(str.length);
			for(String x:str) {
				System.out.println(x);
			}
			
		}
	}

}
