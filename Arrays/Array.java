public class Array {

	public static void main(String[] args) {
		//int[] data = new int[10];
		// int [] a= new int[6];
		// doubleIt(a);

		// int [] b = {1, 2, 3, 4, 5};
		// sum(b);

		// int [] c = {1, 2, 3, 4, 5, 6};
		// element(c);

		int [] d = {-12, -24, -3, -49, -56};
		small(d);

		// for (int i=0; i<data.length; i++) {
		// 	data[i] = 10;
			
		// }

		// for (int i=0, j=10; i<data.length; i++, j--) {
		// 	data[i] = j;
		// 	System.out.println(data[i]);
		// }


		

	}

	public static int[] element(int[] c) {
		int largest = c[0];
		int secondLarge = c[1];
		for (int i = 0; i < c.length; i++) {
			if (c[i] > largest) {
				largest = c[i];		
			}

			if (c[i] > secondLarge) {
				secondLarge = c[i-1];
			}
			
		}

		System.out.println("Largest Variable " + largest);
		System.out.println("Second Largest Variable " + secondLarge);

		return c;
	}

	public static int[] small(int[] d) {
		int closest = d[0];
		for (int i = 0; i < d.length; i++) {
			if (d[i] > 0 && d[i]< closest) {
				closest = d[i];
				
			}

			if (d[i] < 0 && d[i] > closest) {
				closest = d[i];
			}
		}
		System.out.println("Number closest to zero: " + closest);
		return d;
	}

	public static int[] sum(int[] b) {
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] %2 == 0) {
				evenSum += b[i];
			}else {
				oddSum += b[i];
			}
			
		}
		int total = evenSum + oddSum;
		System.out.println("Even sum: " + evenSum);
		System.out.println("Odd sum: " + oddSum);
		System.out.println("Total sum " + total);


		return b;
	}

	public static int[] doubleIt(int[] a) {
		for (int i = 0, j = 5; i < a.length; i++, j--) {
			a[i] = j*2;
			
			
		}
		printArray(a);
		return a;
	}

	public static void printArray(int[] a) {
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}