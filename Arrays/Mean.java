import java.util.Random;

public class Mean {

	private static Random r = new Random(5345);

	public static void main(String[] args) {
		int[] randomArray = makeRandom(1000, 100);
		System.out.println("The average of the array is ");
		System.out.println(mean(randomArray) + ".");

		System.out.println("The average from index 40 to index 45 is ");
		System.out.println(meanOfRange(randomArray, 40, 45) + ".");
	}

	//mean of the numbers in a 
	public static double mean(int[] a) {
		//write this
		int sum = 0;
		double total = 0.0;

		for (int i = 0; i<a.length; i++) {
			sum = a[i] + sum;
		}

		total = sum/a.length;

		return total;


	}

	//mean of a from index start to index end inclusive
	public static double meanOfRange(int[] a, int start, int end) {
		//write this
		double total = 0.0;

		for (int i = start; i<=end; i++) {
			total += a[i];
		}



		return total / (end - start + 1);
	}

	//creates an integer aray of length size with numbers ranging
	//from 0 to range
	public static int[] makeRandom(int size, int range) {
		int [] a = new int[size];

		for (int i=0; i<a.length; i++) {
			a[i] = r.nextInt(range + 1);
		}

		return a;
	}
}