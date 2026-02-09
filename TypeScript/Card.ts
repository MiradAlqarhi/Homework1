export class Card {

    name: string;
    wrongLast: boolean;

    constructor(name: string, wrongLast: boolean) {
        this.name = name;
        this.wrongLast = wrongLast;
    }

    wasWrongLast(): boolean {
        return this.wrongLast;
    }
}
