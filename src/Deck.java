import java.util.ArrayList;
/**
 * Created by Nico on 8/27/15.
 */
public class Deck {
    String deckName;
    ArrayList<Card> cards = new ArrayList<Card>();
    public Deck() {}

    public void setName(String name) {
        this.deckName = name;
    }

    public String getName() {
        return this.deckName;
    }

    public void addCard(Card newCard) {
        cards.add(newCard);
    }

    public void createCard(String name, ArrayList<Attribute> attributtes) {
        Card newCard = new Card();
        newCard.setName(name);
        newCard.setAttributtes(attributtes);
        cards.add(newCard);
    }

    public Card getCard() {
        return this.cards.get(cards.size()-1);
    }

}

