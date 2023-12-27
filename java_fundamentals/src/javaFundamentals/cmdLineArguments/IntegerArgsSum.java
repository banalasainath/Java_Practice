package javaFundamentals.cmdLineArguments;
//program to take 2 integer inputs from command line and printing their sum
public class IntegerArgsSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Integer.valueOf(args[0])+Integer.valueOf(args[1]));
        //String to Integer conversion can be done using either Integer.valueOf() fun or 
        //Integer.parseInt()
        System.out.println(Integer.parseInt(args[0])+Integer.parseInt(args[1]));
	}

}
