import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;


public class BlackJackApplet extends Applet implements ActionListener {

	private Deck table;
	private Hand player;
	private Hand dealer;
	private int totalCards;
	private JButton hit, stay, doubleDown, reset;
	private JLabel label;


	public void init() {
		//super();
		int total = 0;
		this.table = new Deck();
		this.player = new Hand();
		this.dealer = new Hand();
		table.shuffle();
		player.addACard(table.deal());
		dealer.addACard(table.deal());
		player.addACard(table.deal());
		dealer.addACard(table.deal());



		// NumberPanel np = new NumberPanel();
		// this.add(np);

		String title = "Hit";
		hit = new JButton(title);
		hit.setActionCommand(title);
		hit.addActionListener(this);
		this.add(hit);

		title = "Stay";
		stay = new JButton(title);
		stay.setActionCommand(title);
		stay.addActionListener(this);
		this.add(stay);

		title = "New Game";
		reset = new JButton(title);
		reset.setActionCommand(title);
		reset.addActionListener(this);
		this.add(reset);

		
	}

	public Deck getTable() {
		return this.table;
	}

	public Hand getPlayer() {
		return this.player;
	}

	public Hand getDealer() {
		return dealer;
	}

	public void actionPerformed(ActionEvent ae) {

		if ("Hit".equals(ae.getActionCommand())) {
			int playerSum = player.getValue();
			if (playerSum < 21) {
				System.out.println(this.table);
				System.out.println(this.player);
				player.addACard(table.deal());
				//label.setText(value+"");
				repaint();
			} else if (playerSum > 21) {
				this.label = new JLabel("Bust");
				label.setFont(new Font("sansserif", Font.BOLD, 32));
				this.add(label);
			}
			
		} else if ("Stay".equals(ae.getActionCommand())) {
			int dealerSum = dealer.getValue();
			while (dealerSum < 17) {
				dealer.addACardDealer(table.deal());
				dealerSum = dealer.getValue();
				//dealerSum += dealer.getValue();
				repaint();
			}
			//repaint();
		}

		if ("New Game".equals(ae.getActionCommand())) {
			init();
			repaint();
		}
	}

	public void paint(Graphics g) {
		super.paint(g);
		player.drawPlayer(g);

		dealer.drawDealerFirst(g);


	}

	// public void paintBust(Graphics g) {
	// 	g.drawString("Bust", 100, 500);
	// }

}