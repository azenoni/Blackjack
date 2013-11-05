import java.util.Random;
public class Deck {
	
	Card[] cards = new Card[52];
	Random random = new Random();

	public Deck() {

		for (int h = 1; h<= 13; h++) {
			int i = h;
			if (h>10) {
				i = 10;
			}
			Card newCard = new Card(i, "Hearts");
			cards[h-1] = newCard;
		}

		for (int d = 1; d<= 13; d++) {
			int i = d;
			if (d>10) {
				i = 10;
			}
			Card newCard = new Card(i, "Diamonds");
			cards[d + 12] = newCard;
		}

		for (int c = 1; c<= 13; c++) {
			int i = c;
			if (c>10) {
				i = 10;
			}
			Card newCard = new Card(i, "Clubs");
			cards[c + 25] = newCard;
		}

		for (int s = 1; s<= 13; s++) {
			int i = s;
			if (s>10) {
				i = 10;
			}
			Card newCard = new Card(i, "Spades");
			cards[s + 38] = newCard;
		}
		shuffle();
		
	}

	public void shuffle() {
		for (int i = cards.length - 1; i > 0; i--) {
			Card a = cards[i];
			int temp = random.nextInt(i);
			cards[i] = cards[temp];
			cards[temp] = a;
		}
	}

	public void print() {
		for (int i = 0; i < 52; i++) {
			cards[i].print();
		}
	}
}