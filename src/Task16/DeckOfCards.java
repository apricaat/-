package Task16;

import java.util.ArrayList;

public class DeckOfCards {
    private ArrayList<Card> cards;

    public DeckOfCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Card takeItUp(){
        Card card = cards.get(0);
        cards.remove(0);
        return card;
    }

    public void putItDown(Card card){
        cards.add(cards.size(), card);
    }

    public int getSize(){
        return cards.size();
    }

    @Override
    public String toString() {
        return "Task16.DeckOfCards{" +
                "cards=" + cards +
                '}';
    }

}