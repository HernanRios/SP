import java.util.ArrayList;

/**
 * Created by Nico on 8/27/15.
 */
public class Maso {
    String deckName;
    ArrayList<Carta> cards = new ArrayList<Carta>();
    public Maso () {
    }
    public void setName(String name) {
        this.deckName = name;
    }

    public String getName() {
        return this.deckName;
    }

    public void addCard(String name, Atributo attributtes) {
        Carta newCard = new Carta();
        newCard.setName(name);
        newCard.setAttributtes(attributtes);
        cards.add(newCard);
    }
}
