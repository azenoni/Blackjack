public class Hand {

	Card[] maxCards = new Card[11];
	private Deck cards;
	private int toatal;
	private int temp;

	public Hand() {
		for (int i = 0; i < 11; i++) {
			int a = cards[i];
			maxCards[i] = a;
		}

		for (int i = 0; i < 11; i ++) {
			if (maxCards[i] > 21) {
				total = temp;
			} else {
				temp += maxCards[i];
			}
		}
	}
}