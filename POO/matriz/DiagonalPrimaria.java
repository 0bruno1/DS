package matriz;
public class DiagonalPrimaria {
	public static void main(String[] args) {
		int a[][] = new int[3][3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
	    a[1][2] = 6;
	    a[2][0] = 7;
	    a[2][1] = 8;
	    a[2][2] = 9;
		for(int i = 0;i<3;i++) {
			for(int k = 0;k<3;k++) {
				if(k == i) {
					System.out.print(a[i][k]);
				}
			}	
				System.out.println();
		}
				System.out.println("Esta é a diagonal primária da matrix");
	}
}

