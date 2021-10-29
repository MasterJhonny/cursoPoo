import Payment from "./Payment.js";

class Card extends Payment {
    constructor(id, numberCard, dateCard, cvv){
        super(id);
        this.numberCard = numberCard;
        this.dateCard = dateCard;
        this.cvv = cvv;
    }
}

export default Card;