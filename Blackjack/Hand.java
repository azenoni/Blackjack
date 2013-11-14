import java.awt.*;
public class Hand {

	private Card[] maxCards;
	private Deck cards;
	private int total;
	private int temp;
	private int number;
	private int xOffset = 25;

	public Hand(Card firstCard) {
		this.cards = cards;
		int total;
		this.maxCards = new Card[11];
		maxCards[0] = firstCard;
		// if (hit = 1) {
		// 	cards.draw(g, xOffset, 500, 1);
		// 	total += cards.getValue();
		// }
		
	}

	public void addACard(int x) {
		if (total < 21) {
			maxCards[amountOfCards] = x;
		}
	}

	public void draw(Graphics g) {	
		for (int i = 0; i < maxCards.length; i ++) {
			maxCards[i].draw(g, new Rectangle(xOffset, 50, 200, 300));
			xOffset += 50;
		}
		


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

	// public int hit(Graphics g) {
	// 	// if () {
			
	// 	// }
	// }
}