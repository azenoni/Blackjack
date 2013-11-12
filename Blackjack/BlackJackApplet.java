import java.awt.*;
import java.applet.*;

public class BlackJackApplet extends Applet {

	private Deck table;
	private Hand player;
	private Hand dealer;

	public void init() {
		table = new Deck();
		player = new Hand(table);
		dealer = new Hand(table);
	}

	public void paint(Graphics g) {
		g.setFont(new Font("Serif", Font.BOLD, 64));
		// table.draw(g, 50);
		table.shuffle();
		// table.draw(g, 200);
		player.dealPlayer(g , 2);
		dealer.dealDealer(g, 2);
		player.dealPlayer(g , 1);
		dealer.dealDealer(g, 2);
		g.drawString("Bust", 750, 150);

	}

}