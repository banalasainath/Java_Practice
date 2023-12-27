package patterns;

public class Butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<6;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			for(int k=0;k<10-2*i;k++) {
				System.out.print(" ");
			}
			for(int l=0;l<i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4;i>=1;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			for(int k=0;k<10-2*i;k++) {
				System.out.print(" ");
			}
			for(int l=0;l<i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
