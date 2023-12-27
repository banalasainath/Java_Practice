package patterns;

public class Full_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			for(int j=0;j<10-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// Full Triangle Pattern with numbers
		for(int i=1;i<=9 ;i++) {
			for(int j=0;j<10-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(k);
			}
			for(int k=1;k<i;k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
