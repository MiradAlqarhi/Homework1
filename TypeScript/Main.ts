import { Card } from "./Card";
import { newRecentMistakesFirstSorter } from "./newRecentMistakesFirstSorter";

const cards: Card[] = [];

cards.push(new Card("Card C (Correct)", false));
cards.push(new Card("Card A (Wrong)", true));
cards.push(new Card("Card B (Wrong)", true));
cards.push(new Card("Card D (Correct)", false));

const sorter = new newRecentMistakesFirstSorter();
const sortedCards = sorter.organize(cards);

console.log("Cards sorted (wrong answers first):");

for (const c of sortedCards) {
    console.log(c.name);
}
