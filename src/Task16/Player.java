package Task16;

public class Player {
    public DeckOfCards deckOfCards;
    public boolean isAlive = true;

    public Player(DeckOfCards deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public DeckOfCards getDeckOfCards() {
        return deckOfCards;
    }

    public void setDeckOfCards(DeckOfCards deckOfCards) {
        this.deckOfCards = deckOfCards;
    }

    public boolean isAlive() {
        if (deckOfCards.getSize() == 0){
            isAlive = false;
        }
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public boolean makeMove(Player player) {
        if (!this.isAlive) {
            return false;
        } else if (!player.isAlive()) {
            return true;
        } else if (this.deckOfCards.getSize() == 0) {
            isAlive = false;
            return false;
        } else if (player.getDeckOfCards().getSize() == 0) {
            player.setAlive(false);
            return false;
        } else {
            Card thisPlayerCard = this.deckOfCards.takeItUp();
            Card otherPlayerCard = player.getDeckOfCards().takeItUp();
            // Если карта первого игрока больше то он забирает эти две карты назад
            if (thisPlayerCard.isBig(otherPlayerCard)){
                this.deckOfCards.putItDown(thisPlayerCard);
                this.deckOfCards.putItDown(otherPlayerCard);
            }
            else {
                player.getDeckOfCards().putItDown(otherPlayerCard);
                player.getDeckOfCards().putItDown(thisPlayerCard);
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "Task16.Player{" +
                "deckOfCards=" + deckOfCards +
                ", isAlive=" + isAlive +
                '}';
    }
}
