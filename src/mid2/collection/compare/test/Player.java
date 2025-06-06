package mid2.collection.compare.test;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void drawCard(Deck deck) {
        hand.add(deck.drawCard());
    }

    public int numSum() {
        int value = 0;
        for (Card card : hand) {
            value += card.getNumber();
        }
        return value;
    }

    public void showHand() {
        hand.sort(null);
        System.out.println(name + "의 카드: " + hand + ", 합계: " + numSum());
    }
}
