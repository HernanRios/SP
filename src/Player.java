//import java.util.Random;
/**
 * Created by Nico on 8/30/15.
 */
public class Player {
    private Deck deck;
    private String name;

    public Player(String name, Deck deck) {
        this.name = name;
        this.deck = deck;
    }

    public Card play() {
        return this.deck.getCard();
    }

    public void won(Card card) {
        this.deck.addCard(card);
    }

    public void Cardlost() {
        this.deck.removeCard();
    }

    //public selectAttribute() {
    //    int a = Random.nextInt(1 - 7 + 1) + 1
    //}
}
