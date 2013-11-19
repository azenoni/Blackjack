import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class NumberPanel extends JPanel implements ActionListener {
	private JLabel label;
	private JButton hit, stay, doubleDown;
	private int value = 0;
	private Hand player;
	private Deck table;
	private BlackJackApplet bja;

	public NumberPanel() {
		super();
		this.bja = new BlackJackApplet();
		this.player = bja.getPlayer();
		this.table = bja.getTable();

		// label = new JLabel(value + "");
		// label.setFont(new Font("sansserif", Font.BOLD, 32));
		// this.add(label);

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

		//this.addMouseListener(this);
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
			//System.out.println("sub");
			//dealer.addACard(table.deal());
			//label.setText(value+"");
			repaint();
		}
	}
}