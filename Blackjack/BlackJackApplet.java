import java.awt.*;
import java.applet.*;


public class BlackJackApplet extends Applet {

	private Deck table;
	private Hand player;
	private Hand dealer;
	private int totalCards;

	public void init() {
		int total = 0;
		table = new Deck();
		player = new Hand();
		dealer = new Hand();
		table.shuffle();
		player.addACard(table.deal());
		dealer.addACard(table.deal());
		player.addACard(table.deal());
		dealer.addACard(table.deal());
		
			// if (total > 21) {
			// 	i = 11;
			// }
		
		//dealer = new Hand(table);
	}

	public void paint(Graphics g) {
		player.drawPlayer(g);

		dealer.drawDealer(g);


	}

}