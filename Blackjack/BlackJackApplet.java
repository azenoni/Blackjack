import java.awt.*;
import java.applet.*;


public class BlackJackApplet extends Applet {

	private Deck table;
	private Hand player;
	private Hand dealer;

	public void init() {
		int total = 0;
		table = new Deck();
		for (int i = 0; i < 11; i++) {
			player = new Hand(table.cards[i]);
			total += table.deal().getValue();
			// if (total > 21) {
			// 	i = 11;
			// }
		}
		
		//dealer = new Hand(table);
	}

	public void paint(Graphics g) {
		// g.setFont(new Font("Serif", Font.BOLD, 64));
		// g.drawString("Bust", 750, 150);
		table.shuffle();
		//player.dealPlayer(g , 2);
		player.draw(g);
		player.draw(g);

	}

}