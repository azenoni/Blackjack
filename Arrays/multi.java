public class multi {
	

	public static void main(String[] args) {
		int[][] a ={	{1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15} };

		//sumRow(a, 0);
		//sumCol(a, 1);
		//sumTotal(a);
		reverseRow(a , 1);

	}

	public static void print(int[][] a) {
		for (int r = 0; r<a.length; r++) {
			for (int c = 0; c<a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static int sumRow(int [][] a , int x) {
		int sum = 0;
		for (int r = 0; r < a[x].length; r++) {
			sum = a[x][r] + sum; 
		}

		System.out.println(sum);

		return sum;
	}

	public static int sumCol(int [][] a , int x) {
		int sum = 0;
		for (int r = 0; r<a.length; r++) {
				sum += a[r][x];
		}

		System.out.println(sum);

		return sum;
	}

	public static int sumTotal(int [][] a) {
		int sum = 0;
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c<a[r].length; c++) {
				sum += a[r][c];
			}
		}

		System.out.println(sum);
		return sum;
	}

	public static int[][] reverseRow(int [][] a, int x) {
		for (int r = a.length + 1; r >= 0; r--) {
			System.out.print(a[x][r] + " ");
		}

		return a;
	}

	public static int[][] reverseCol(int [][] a, int x) {
		
	}





}