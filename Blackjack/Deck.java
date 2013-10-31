public class Deck {
	
	Card[] cards = new Card[52];

	public Deck() {

		for (int h = 1; h<= 13; h++) {
			Card newCard = new Card(h, "Hearts");
			cards[h-1] = newCard;
		}

		for (int d = 1; d<= 13; d++) {
			Card newCard = new Card(d, "Diamonds");
			cards[d + 12] = newCard;
		}

		for (int c = 1; c<= 13; c++) {
			Card newCard = new Card(d, "Clubs");
			cards[c + 25] = newCard;
		}

		for (int s = 1; s<= 13; s++) {
			Card newCard = new Card(d, "Spades");
			cards[s + 38] = newCard;
		}
		
	}
}