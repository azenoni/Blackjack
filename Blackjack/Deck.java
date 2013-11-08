import java.util.Random;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Deck {
	
	Card[] cards = new Card[52];
	Random random = new Random();

	public Deck() {

		for (int h = 1; h<= 13; h++) {
			int i = h;
			if (h>10) {
				i = 10;
			}
			Card newCard = new Card(i, "Hearts", h);
			cards[h-1] = newCard;
		}

		for (int d = 1; d<= 13; d++) {
			int i = d;
			if (d>10) {
				i = 10;
			}
			Card newCard = new Card(i, "Diamonds", d);
			cards[d + 12] = newCard;
		}

		for (int c = 1; c<= 13; c++) {
			int i = c;
			if (c>10) {
				i = 10;
			}
			Card newCard = new Card(i, "Clubs" , c);
			cards[c + 25] = newCard;
		}

		for (int s = 1; s<= 13; s++) {
			int i = s;
			if (s>10) {
				i = 10;
			}
			Card newCard = new Card(i, "Spades", s);
			cards[s + 38] = newCard;
		}
		//shuffle();
		
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

	public void draw(Graphics g, int yOffset, int amount) {
		int xOffset = 50;
		for (int i = 0; i < amount; i++) {
			cards[i].draw(g, new Rectangle(xOffset, yOffset, 200, 300));
			xOffset += 25;
		}
	}

	// public void draw2(Graphics g, int amount) {
	// 	int xOffset = 50;
	// 	for (int i = 0; i < amount; i++) {
	// 		cards[i].draw(g, new Rectangle(xOffset, 50, 200, 300));
	// 		xOffset += 25;
	// 	}
	// }
}