class Estudents {
    constructor(name, age, document, present) {
        this.name = name;
        this.age = age;
        this.document = document;
        this.email = null;
        this.tutor = null;
        this.present = present;
    }

    saludar() {
        let { name, age } = this
        console.log(`hi, my name is ${this.name} y have ${this.age}`)
    }
}

export default Estudents