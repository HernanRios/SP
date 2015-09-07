import java.util.Random;
/**
 * Created by Nico on 8/30/15.
 */
public class Player {
    private Deck deck;

    public Player(Deck deck) {
        this.deck = deck;
    }

   // public Player(){}

    public Card play() {
        if (deck.getQuantityCards() > 0) {
            return this.deck.getCard();
        }
        else
            return null;
    }

    public Player(String name) {
    }

    public void addCard(Card card) {
        this.deck.addCard(card);
    }

    public Card getCard() {
        Card lostCard = this.deck.getCard();
        this.deck.removeCard();
        return lostCard;
    }

    public int remainingCards() {
        return deck.getQuantityCards();
    }

    public int selectAttribute() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(deck.getAttributesAmount() - 1);
    }
}
