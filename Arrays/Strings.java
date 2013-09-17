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

		System.out.println("biopsy:" + isAbecedarian("biopsy"));
		System.out.println("Yolo: " + isAbecedarian("Yolo"));


		System.out.println(isDupledrome("llaammaa"));

		captainCrunch("cDeF", 13);

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
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) > s.charAt(i+1)) {
				return false;
			}
		}

		return true;
	}

	public static boolean isDupledrome(String s) {
		for (int i = 0; i< s.length()-1; i+=2 ) {
			if (s.charAt(i) != s.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}

	public static void captainCrunch(String s, int x) {
		char value;
		char value26 = 26;
		String finalValue = "";

		System.out.println("Decoded: " + s);

		for (int i = 0; i < s.length(); i++) {
			value = (char)(s.charAt(i) + x);
			if (s.charAt(i) < 91 && value > 90 ) {
				value = (char)(s.charAt(i) - 13);
			}
			if (s.charAt(i) < 123 && s.charAt(i) > 96 && value > 122 ) {
				value = (char)(s.charAt(i) - 13);
			}

			finalValue = finalValue + value;
		}
		System.out.println("Encoded: " + finalValue);
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
