import Account from './Account.js'
class User extends Account {
    constructor(name, document){
        super(name, document);
    }
}

export default User;