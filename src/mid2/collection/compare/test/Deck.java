package mid2.collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck() {
        initCards();
        suffle();
    }

    private void initCards() {
        for (int i = 1; i <= 13; i++) {
            for (Icon value : Icon.values()) {
                cards.add(new Card(i, value));
            }
        }
    }

    private void suffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.remove(cards.size() - 1);
    }
}