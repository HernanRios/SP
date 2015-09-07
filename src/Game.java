import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Nico on 8/30/15.
 */
public class Game {
    private Deck deck;
    private int playersAmount;
    int runWinner = 0;
    ArrayList<Deck> decksPlayers = new ArrayList<Deck>();
    ArrayList<Player> players = new ArrayList<Player>();
    HashMap<Card, Player> cardsOwners = new HashMap<Card, Player>();

    public Game(Deck deck, int playersAmount) {
        this.deck = deck;
        this.playersAmount = playersAmount;
        for (int i = 0; i < playersAmount; i++) {
            Deck newDeck = new Deck();
            decksPlayers.add(newDeck);
            Player newPlayer = new Player(decksPlayers.get(i));
            players.add(newPlayer);
        }
        dealCards();
    }

    private void nextRound() {
        Card card, winCard;
        ArrayList<Card> cardsInPlay = new ArrayList<>();
        int attributeInGame = players.get(runWinner).selectAttribute();
        for (Player player : players) {
            card = player.getCard();
            cardsOwners.put(card,player);
            cardsInPlay.add(card);
        }
        winCard = winCard(cardsInPlay, attributeInGame);

        for (int i = 0; i < playersAmount; i++) {

        }
    }

    private void dealCards() {
        while (deck.getQuantityCards() >= players.size()) {
            for (int i = 0; i <= players.size() - 1 ; i++) {
                players.get(i).addCard(deck.getCard());
            }
        }
    }

    private void removeLosers() {
        for (int i = 0; i < this.players.size(); i++) {
            if (this.players.get(i).remainingCards() == 0) {
                this.players.remove(this.players.get(i));
            }
        }
    }

    private boolean existWinner() {
        if (players.size() == 1)
            return true;
        else
            return false;
    }

    //private Player confrontation(Player player, Player opponent ) {
    //}

    private Card winCard(ArrayList<Card> cardInPlay, int condition) {
        do {
            if (cardInPlay.size() == 1)
                return cardInPlay.get(0);
            else {cardInPlay.remove(loserCard(cardInPlay.get(0), cardInPlay.get(1), condition));}
            } while (cardInPlay.size() != 1);
        return cardInPlay.get(0);
    }


    private Card loserCard(Card cardOpponent1, Card cardOpponent2, int attribute) {
        int condition = cardOpponent1.getAttributeCondition(attribute);
        int attributteCard1 = cardOpponent1.getAttribute(attribute) * condition;
        int attributteCard2 = cardOpponent2.getAttribute(attribute) * condition;
        if (attributteCard1 > attributteCard2) {
            return cardOpponent2;
        } else if (attributteCard2 > attributteCard1) {
            return cardOpponent1;
        } else {
            return null;
        }
    }
}
