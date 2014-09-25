package org.game.cards;
import java.util.ArrayList;
public class Card
	{
	public static void main(String[] args)
		{
		  private String face;
		    private String suit;
		    public Card(String face, String suit) {
		        this.face = face;
		        this.suit = suit;
		    }
		    public String getFace() {
		        return face;
		    }
		    public void setFace(String face) {
		        this.face = face;
		    }
		    public String getSuit() {
		        return suit;
		    }
		    public void setSuit(String suit) {
		        this.suit = suit;
		    }
		    public String toString() {
		        return face + " of " + suit;
		    }


		}

	}
