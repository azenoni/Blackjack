import java.awt.*;
public class Hand {

	Card[] maxCards = new Card[11];
	private Deck cards;
	private int total;
	private int temp;
	private int number;
	private int xOffset = 25;

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

	public void dealPlayer (Graphics g , int number) {
		xOffset += 50;
		cards.draw(g , xOffset, 25, number);
		//xOffset += 25;
	}

	public void dealDealer(Graphics g, int number) {
		xOffset += 50;
		cards.draw(g, xOffset, 500, number);
		//xOffset += 25;
	}
}