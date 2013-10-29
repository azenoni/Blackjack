public class Card {
	private String card;
	private int number;
	public Card(String card, int number) {
		this.card = card;
		this.number = number;
	}

	public Card(String card){
		
	}


	Card ace = new Card("Ace", 1);
	Card two = new Card("Two");
}