import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Card {
	private int value;
	private String suit;
	private int value2;
	private Image image;
	private int faceNumber;
	private Image backOfCard;
	public Card(int value, String suit, int faceNumber) {
		this.value = value;
		this.suit = suit;
		this.faceNumber = faceNumber;
		this.image = Card.loadImage(getfaceNumber() + suit);
		this.backOfCard = Card.loadImage("back-blue");
		value2 = value;
		if (value == 1) {
			value2 = 11;
		}
		//System.out.println("" + this.value  + " " +this.suit);
	}

	public Card(int value, int value2, String suit, int faceNumber) {
		this.suit = suit;
		this.value = value;
		this.value2 = value2;
		this.faceNumber = faceNumber;
		this.image = Card.loadImage(getfaceNumber() + suit);
	}

	public void switchCardFace() {
		this.backOfCard = this.image;
	}

	public int getValue() {
		return this.value;
	}

	public int getValue2() {
		return this.value2;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getSuit() {
		return this.suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public void print(){
		System.out.println(value + " " + suit + " " + faceNumber);
	}


	public void draw(Graphics g, Rectangle r) {
		g.drawImage(image, r.x, r.y, r.width, r.height, null);
	}

	public void drawBackOfCard(Graphics g, Rectangle r) {
		g.drawImage(backOfCard, r.x, r.y, r.width, r.height, null);
	}

	public String getfaceNumber() {
		if (this.faceNumber == 1) {
			return "A";
		} else if (this.faceNumber > 1 && this.faceNumber <= 10) {
			return "" + this.faceNumber;
		} else if (this.faceNumber == 11) {
			return "J";
		} else if(this.faceNumber == 12) {
			return "Q";
		} else if (this.faceNumber ==13) {
			return "K";
		}
		return null;
	}

	public void setfaceNumber(int faceNumber) {
		this.faceNumber = faceNumber;
	}


	private static Image loadImage(String name) {
		String path = null;
		Image image = null;
		

		try{
			 path = "Cards" + File.separator + name + ".png";
			image = ImageIO.read(new File(path));
		} catch(IOException e) {
			System.out.println("Could not load image at path: " + path);
			System.exit(1);
		}

		return image;
	}
}