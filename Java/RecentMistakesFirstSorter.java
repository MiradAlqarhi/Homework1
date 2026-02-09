import java.util.ArrayList;
import java.util.List;

public class RecentMistakesFirstSorter implements CardOrganizer {

    @Override
    public List<Card> organize(List<Card> cards) {

        List<Card> wrongCards = new ArrayList<>();
        List<Card> correctCards = new ArrayList<>();

        for (Card card : cards) {
            if (card.wasWrongLast()) {
                wrongCards.add(card);
            } else {
                correctCards.add(card);
            }
        }

        List<Card> result = new ArrayList<>();
        result.addAll(wrongCards);
        result.addAll(correctCards);

        return result;
    }
}
