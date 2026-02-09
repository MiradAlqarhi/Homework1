public class Card {

    private String name;
    private boolean wrongLast;

    public Card(String name, boolean wrongLast) {
        this.name = name;
        this.wrongLast = wrongLast;
    }

    public boolean wasWrongLast() {
        return wrongLast;
    }

    public String getName() {
        return name;
    }
}
