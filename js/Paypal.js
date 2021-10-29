import Payment from './Payment.js'

class Paypal extends Payment {
    constructor(id, email){
        super(id);
        this.email = email;
    }
}

export default Paypal;