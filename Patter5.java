package loops;


public class Patter5 {

	public static void main(String[] args) {
		for (int i=1;i<=3;i++) {
			for(int j=1;j<=3-i+1;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=4*i-3;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=3-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
			for(int j=1;j<=9-4*i+4;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		              

	}

}
