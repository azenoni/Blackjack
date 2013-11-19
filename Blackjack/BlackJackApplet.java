import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;


public class BlackJackApplet extends Applet implements ActionListener {

	private Deck table;
	private Hand player;
	private Hand dealer;
	private int totalCards;
	private JButton hit, stay, doubleDown;

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
			//System.out.println("add");
			System.out.println(this.table);
			System.out.println(this.player);
			player.addACard(table.deal());
			//label.setText(value+"");
			repaint();
		} else if ("Stay".equals(ae.getActionCommand())) {
			int dealerSum = dealer.getValue();
			while (dealerSum < 17) {
				dealer.addACard(table.deal());
				dealerSum += dealer.getValue();
			}
			repaint();
		}
	}

	public void paint(Graphics g) {
		super.paint(g);
		player.drawPlayer(g);

		dealer.drawDealerFirst(g);


	}

}