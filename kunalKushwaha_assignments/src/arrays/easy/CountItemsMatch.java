package arrays.easy;
//You are given an array items, where each items[i] = [typei, colori, namei] describes the 
//type, color, and name of the ith item. You are also given a rule represented by two strings, 
//ruleKey and ruleValue.
//The ith item is said to match the rule if one of the following is true:
//ruleKey == "type" and ruleValue == typei.
//ruleKey == "color" and ruleValue == colori.
//ruleKey == "name" and ruleValue == namei.
import java.util.*;
public class CountItemsMatch {
	static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
		int count=0;
		int index=-1;
		if(ruleKey.contentEquals("type")) {
			index=0;
		}
		if(ruleKey.contentEquals("color")) {
			index=1;
		}
		if(ruleKey.contentEquals("name")) {
			index=2;
		}
		for(List<String> i:items) {
			if(ruleValue.contentEquals(i.get(index))) {
				count+=1;
			}
		}
		return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<List<String>> list=new ArrayList<>();
		List<String> in_list=new ArrayList<>();//first inner list
		in_list.add("phone");
		in_list.add("blue");
		in_list.add("pixel");
		list.add(in_list);//adding to main list
		List<String> in_list1=new ArrayList<>();//creating second inner list
		in_list1.add("computer");
		in_list1.add("silver");
		in_list1.add("lenovo");
		list.add(in_list1);//adding second inner list to main list
		List<String> in_list2 = new ArrayList<>();
		in_list2.add("phone");
		in_list2.add("gold");
		in_list2.add("iphone");
		list.add(in_list2);
		String ruleKey=sc.next();
		String ruleValue=sc.next();
		System.out.println(countMatches(list,ruleKey,ruleValue));
				
	}

}
