package arrays.easy;
import java.util.*;
public class Panagram {
        
    static boolean checkIfPangram(String sentence) {
    	Set<Character> set = new HashSet<>();
    	for(int i=0;i<sentence.length();i++) {
    		set.add(sentence.charAt(i));
    	}
    	if(set.size()==26) return true;
    	return false;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s= sc.nextLine();
		System.out.println(checkIfPangram(s));
	}

}
