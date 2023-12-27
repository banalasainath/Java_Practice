package practiceProblems;
import java.util.*;
public class Anagram {
	
	static boolean CheckAnagram(String s1,String s2) {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		HashMap<Character,Integer> map1 = new HashMap<>();
		HashMap<Character,Integer> map2 = new HashMap<>();
		if(s1.length()!=s2.length()) {
			return false;
		}
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));
			if(map1.containsKey(s1.charAt(i))) {
				int val = map1.get(s1.charAt(i));
				System.out.println(s1.charAt(i)+""+val);
				map1.put(s1.charAt(i), val+1);
			}
			else {
				map1.put(s1.charAt(i), 1);
			}
			System.out.println(map1);
			if(map2.containsKey(s2.charAt(i))) {
				int val = map2.get(s2.charAt(i));
				map2.put(s2.charAt(i), val+1);
			}
			else {
				map2.put(s2.charAt(i), 1);
			}
			System.out.println(map2);
		}
		System.out.println(map1);
		System.out.println(map2);
		for(Character ch : map1.keySet()) {
			if(map1.get(ch)!=map2.get(ch)) {
				return false;
			}
		}
		return true;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		boolean anagram = CheckAnagram(s1,s2);
		System.out.println(anagram);
//		char[] ch1 = s1.toCharArray();
//		char[] ch2 = s2.toCharArray();
//		int length1 = ch1.length;
//		boolean anagram = true;
//		if(ch1.length == ch2.length) {
//			Arrays.sort(ch1);
//			Arrays.sort(ch2);
//			System.out.println(ch1);
//			System.out.println(ch2);
//			for(int i=0;i<ch1.length;i++) {
//				if(Character.toUpperCase(ch1[i])!=Character.toUpperCase(ch2[i])) {
//					anagram = false;
//					break;
//				}
//			}
//		}
//		else {
//			anagram =false;
//		}
//		if(anagram==true) {
//			System.out.println("Anagram");
//		}
//		else {
//			System.out.println("Given strings are not anagram");
//		}
	}

}
