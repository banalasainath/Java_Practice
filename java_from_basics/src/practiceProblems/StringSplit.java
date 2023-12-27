package practiceProblems;
import java.util.*;
import java.io.*;
public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input :");
        String[] s = sc.nextLine().split(" ");
        String[] out=new String[s.length];
        int j=0;
        for(int i=0;i<s.length;i++) {
        	if(s[i].length()%2==0) {
        		out[j]=s[i];
        		j+=1;
        	}
        }
        if(out.length==0) {
        	System.out.println("EMPTY LIST");
        }
        else {
        	for(String i:out) {
        		if(i!=null) {
        			System.out.println(i);
        		}	
        	}
        }
        sc.close();
	}

}
