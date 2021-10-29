class Personal {
    constructor(name, email, password){
        this.name = name;
        this.email = email;
        this.password = password;
        this.edad = null;
    }
    printData(){
        let { name, email } = this
        console.log(`my name is ${name} and email is ${email}`)
    }
}

export default Personal;