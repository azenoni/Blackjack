import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;


public class BlackJackApplet extends Applet implements ActionListener {

	private Deck table;
	private Hand player;
	private Hand dealer;
	private int totalCards;
	private JButton hit, stay, doubleDown, reset, bet;
	private JLabel label;
	private int playerSum;
	private int dealerSum;
	private int wallet;
	private int pot;
	private boolean front = false;
	private String answer;

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

		title = "Bet $10";
		bet = new JButton(title);
		bet.setActionCommand(title);
		bet.addActionListener(this);
		this.add(bet);

		
	}

	public void initialDeal() {
		this.player = new Hand();
		this.dealer = new Hand();
		player.addACard(table.deal());
		dealer.addACard(table.deal());
		player.addACard(table.deal());
		dealer.addACard(table.deal());
		this.playerSum = player.getValue();
		this.dealerSum = dealer.getValue();
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
		int dealerSum = dealer.getValue();
		int playerSum = player.getValue();
		answer = "";
		if ("Hit".equals(ae.getActionCommand())) {
			
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
			if (playerSum > 21) {
				answer = "Bust"
			} else if () {
				
			}
			
		} else if ("Stay".equals(ae.getActionCommand())) {
			front = true;
			while (dealerSum < 17 && dealerSum < playerSum) {
				
				dealer.addACardDealer(table.deal());
				dealerSum = dealer.getValue();
				//dealerSum += dealer.getValue();
				repaint();
			}
			//repaint();
		}

		if ("New Game".equals(ae.getActionCommand())) {
			front = false;
			initialDeal();
			repaint();
		}
		if ("Bet $10".equals(ae.getActionCommand())) {
			pot += 20;
			wallet -=10;
		}
	}

	public void paint(Graphics g) {
		super.paint(g);
		player.drawPlayer(g);
		if (front == true) {
			dealer.drawDealer(g);
		} else {
			dealer.drawDealerFirst(g);
		}
		

		

		


	}

	// public void paintBust(Graphics g) {
	// 	g.drawString("Bust", 100, 500);
	// }

}