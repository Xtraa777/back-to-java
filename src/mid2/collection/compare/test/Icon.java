package mid2.collection.compare.test;

public enum Icon {
    SPADE("♠"),
    HEART("♥"),
    DIAMOND("♦"),
    CLUB("♣");

    private final String icon;

    Icon(String icon) {
        this.icon = icon;
    }

    public String getIcon() {
        return icon;
    }
}