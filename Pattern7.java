package loops;

public class Pattern7 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<4-i+1;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if (j==1 || j==2*i-1)
				    System.out.print(i+" ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
		
	}

}
