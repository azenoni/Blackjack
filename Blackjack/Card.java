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
	public Card(int value, String suit) {
		this.value = value;
		this.suit = suit;
		//System.out.println("" + this.value  + " " +this.suit);
	}

	public Card(int value, int value2, String suit) {
		this.suit = suit;
		this.value = value;
		this.value2 = value2;
	}

	public int getValue() {
		return this.value;
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
		System.out.println(value + " " + suit);
	}


	public void draw(Graphics g, Rectangle r) {
		g.drawImage(image, r.x, r.y, r.width, r.height, null);
	}

	private static Image loadImage(String name) {
		String path = null;
		Image image = null;
		

		try{
			 path = "cards" + File.separator + value + name + ".png";
			//path = "imagessdfa" + File.separator + name + ".jpg";
			// images/JurrsicPark.jpg
			image = ImageIO.read(new File(path));
		} catch(IOException e) {
			System.out.println("Could not load image at path: " + path);
			System.exit(1);
		}

		return image;
	}
}