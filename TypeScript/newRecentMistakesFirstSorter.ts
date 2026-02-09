import { Card } from "./Card";
import { CardOrganizer } from "./CardOrganizer";

export class newRecentMistakesFirstSorter implements CardOrganizer {

    organize(cards: Card[]): Card[] {

        const wrongCards: Card[] = [];
        const correctCards: Card[] = [];

        for (const card of cards) {
            if (card.wasWrongLast()) {
                wrongCards.push(card);
            } else {
                correctCards.push(card);
            }
        }

        return wrongCards.concat(correctCards);
    }
}
