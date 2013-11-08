import java.awt.*;
public class Hand {

	Card[] maxCards = new Card[11];
	private Deck cards;
	private int total;
	private int temp;
	private int number;
	private int a;

	public Hand(Deck cards) {
		this.cards = cards;
		// for (int i = 0; i < 11; i++) {
		// 	int[] a = cards[i];
		// 	maxCards[i] = cards[i];
		// }

		// for (int i = 0; i < 11; i ++) {
		// 	if (temp > 21) {
		// 		temp -= number;
		// 		total = temp;
		// 	} else {
		// 		number = maxCards[i].getValue;
		// 		temp += number;
		// 	}
		// }
	}

	public void deal (Graphics g) {
		cards.draw(g , 50, 2);
		cards.draw(g , 300, 1);
	}
}