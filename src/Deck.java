import java.util.ArrayList;
/**
 * Created by Nico on 8/27/15.
 */
public class Deck {
    private int attributesAmount;
    private ArrayList<Card> cards = new ArrayList<Card>();

    public Deck() {
    }
    public void addCard(Card newCard) {
        cards.add(0, newCard);
    }

    public void createCard(String name, ArrayList<Attribute> attributtes) {
        Card newCard = new Card();
        newCard.setName(name);
        newCard.setAttributtes(attributtes);
        attributesAmount = attributtes.size();
        cards.add(newCard);
    }

    public Card getCard() {
        Card currentCard = cards.get(cards.size() - 1);
        if (!cards.isEmpty()) {
            cards.remove(cards.get(cards.size() - 1));
            return currentCard;
        }
        else
            return null;
    }
    //
    public int getQuantityCards() {
        return this.cards.size();
    }

    //Checked if deck isn't empty and remove de last card.
    public void removeCard() {
        if (!cards.isEmpty())
        this.cards.remove(this.cards.size()-1);
    }

    //This method took the last card in the deck and asked for the attributes amount.
    public int getAttributesAmount() {
        Card card = new Card();
        if (this.cards.size() != 0) {
            card = cards.get(0);
            return card.getAttributesAmount();
        }
        return 0;
    }
}

