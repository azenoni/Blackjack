public class multi {

	public static void main(String[] args) {


		int [][] a ={	 {1,2,3,4,5},
				 	 	 {6,7,8,9,10},
				 	 	 {11,12,13,14,15} };

		int [] c = {1,2,3,4,5,6};


		//sumRow(a , 0);
		//sumCol(a , 1);
		//reverseRow(a , 1);
		//reverseCol(a , 0);
		// int [][] sd = snakeDraft(10, 3);
		// print(sd);

		int [][] r =rectangularlize(c , 3 , 2);
		print(r);


	}

	public static void print(int[][] a) {
		for (int r = 0; r<a.length; r++) {
			for (int c = 0; c<a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}	
			System.out.println();	
		}
	}

	public static int sumRow(int[][] a, int x) {
		int sum = 0;
		for (int r = 0; r < a[x].length; r++) {
			sum = a[x][r] + sum;
		}

		System.out.print(sum);

		return sum;
	}

	public static int sumCol(int[][] a , int x) {
		int sum = 0;
		for (int r = 0; r<a.length; r++) {
			sum += a[r][x];
		}

		System.out.print(sum);

		return sum;
	}

	public static int sumTotal(int[][] a) {
		int sum = 0;
		for (int r = 0; r < a.length; r++) {
			for (int c = 0; c<a[r].length; c++) {
				sum += a[r][c];
			}
		}

		System.out.print(sum);
		return sum;
	}

	public static int[][] reverseRow(int[][] a , int rows) {
		for (int c = a[rows].length-1; c>= 0; c--) {
			System.out.print( a[rows][c] + " ");
		}

		return a;
	}

	public static int[][] reverseCol(int[][] a, int x) {
		for (int c = a.length; c>=0; c--) {
			System.out.print(a[c][x] + " ");
		}
		return a;
	}

	public static int[][] snakeDraft(int players, int rounds) {
		int [][] x = new int[rounds][players];
		int p = 1;
		for (int r = 0; r<rounds; r++) {
			if (r % 2 == 1) {
				for (int z = x[r].length - 1; z>=0; z--) {
					x[r][z]=p;
		 			p++;
				}
			}
			if (r % 2 == 0) {
				for (int z = 0; z < players; z++) {
					x[r][z]=p;
		 			p++;
				}
			}
		}
		return x;
	}

	public static int[][] rectangularlize(int[] a , int rows, int cols) {
		int [][] x = new int[rows][cols];
		int b = 0;
		for (int r = 0; r < rows; r ++) {
			for (int c = 0; c < cols; c++) {
				x[r][c] = a[b];
				b++;
			}
		}

		return x;		
	}


}