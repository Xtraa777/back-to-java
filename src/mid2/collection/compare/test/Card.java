package mid2.collection.compare.test;

public class Card implements Comparable<Card>{

    private final int number;
    private final Icon icon;

    public Card(int number, Icon icon) {
        this.number = number;
        this.icon = icon;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public int compareTo(Card o) {
        if (this.number != o.number) {
            return this.number - o.number;
        } else {
            return this.icon.compareTo(o.icon);
        }
    }

    @Override
    public String toString() {
        return number + "(" + icon.getIcon() + ")";
    }
}