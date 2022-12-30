package Task16;

import java.util.Objects;

public class Card {
    private int value;

    public Card(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isBig(Card card){
        if (this.value == 0 && card.getValue() == 9){
            return true;
        }
        else if (card.getValue() == 0 && this.value == 9){
            return false;
        }
        return this.value > card.getValue();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Card)) return false;
        Card card = (Card) obj;
        return getValue() == card.getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }

    @Override
    public String toString() {
        return "Task16.Card{" +
                "value=" + value +
                '}';
    }
}