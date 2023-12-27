package javaFundamentals.flowCtrl;

public class CheckCmdLineInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        if(args.length==0) {
        	System.out.println("No Values");
        }
        else {
        	for(String s:args) {
        		if(s!=args[args.length-1]) {
        			System.out.print(s+",");
        		}
        		else {
        			System.out.print(s);
        		}
        	}
        }
	}

}
