public class Strings {
	
	public static void main(String[] args) {

		//greenteapress.com

		String str = new String("A string");
		String s = "A String";

		// if (str.equals(s)) {
		// 	System.out.println("A");
		// } else {
		// 	System.out.println("B");
		// }

		// for (int i = 0; i< str.length(); i++) {
		// 	System.out.println(str.charAt(i));

		// }

		// for (int i = 0; i < str.length() - 1; i++) {
		// 	System.out.println(str.substring(i,i +2));
		// }

		// if (contains("baseball", "ball")) {
		// 	System.out.println("Yes");
		// } else {
		// 	System.out.println("No");
		// }

		//System.out.println(hasAnA("Hamburger"));

		//System.out.println(isPalindrome("Racecar"));
		//dsf

		System.out.println(isAbecedarian("Yolo"));

		// System.out.println(isPalindrome("racecar"));

		// System.out.println(count("people", "e"));
	}

	public static int count(String s, String t) {
		int total = 0;
		for (int i = 0; i <= s.length()-t.length(); i++) {
			if (s.substring(i, i+t.length()).equals(t)) {
				total++;
			}
		}
		return total;
	}

	public static boolean hasAnA(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i+1) == "a") {
				return true;
			}
		}
		return false;
	}

	public static boolean isPalindrome(String s) {
		String reverse = new String();
		for (int i = s.length(); i >= 0; i++) {
			reverse = reverse + s.substring(i, i+1);

		}
		if (reverse.equalsIgnoreCase(s)) {
			return true;
		}
		return false;
	}

	public static boolean isAbecedarian(String s) {
		for (int i = 0; i <= s.length(); i++) {
			if (s.charAt(i) <= s.charAt(i+1)) {
				return true;
			} 
		}

		return false;
	}

	public static boolean contains(String s, String t) {
		for (int i = 0; i < s.length()-t.length(); i++) {
			if (s.substring(i, i+t.length()).equals(t)) {
				return true;
			}
		}
		return false;

	}
}