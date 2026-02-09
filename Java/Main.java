import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Card> cards = new ArrayList<>();

        cards.add(new Card("Card C (correct)", false));
        cards.add(new Card("Card A (wrong)", true));
        cards.add(new Card("Card B (wrong)", true));
        cards.add(new Card("Card D (correct)", false));

        CardOrganizer sorter = new RecentMistakesFirstSorter();
        List<Card> sortedCards = sorter.organize(cards);

        System.out.println("Cards sorted (wrong answers first):");

        for (Card c : sortedCards) {
            System.out.println(c.getName());
        }
    }
}
