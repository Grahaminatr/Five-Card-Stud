package org.game.cards;
import java.util.ArrayList;
public class Player {
    public final static int MAX_CARD = 5;
    private Card cards[];
    public Player() {
        cards = new Card[MAX_CARD];
    }
    public Card[] getCards() {
        return cards;
    }
    public Card getCardAtIndex(int index) {
        if (index >= 0 && index < MAX_CARD)
            return cards[index];
        else
            return null;
    }
    public void setCardAtIndex(Card c, int index) {
        if(index >= 0 && index < MAX_CARD)
            cards[index] = c;
    }
    public int countPair() {
        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].getFace().equals(cards[j].getFace())){
                    count++;
                }
            }
        }
        return count;
    }

    
    public boolean isFlush() {
        int count = 0;
        for (int i = 0; i < cards.length; i++) {
            for (int j = i + 1; j < cards.length; j++) {
                if (cards[i].getSuit().equals(cards[j].getSuit())) {
                    count++;
                }
            }
        }
        if(count == 5)
            return true;
        else
            return false;
    }    
}
