class Person {
    constructor(name, age, address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    saludar() {
        let { name, age, address } = this
        console.log(`Hi my name is ${name} and my address is ${address} and have ${age} years`)
    } 
}

let juan = new Person('Juan', 34, 'calle Vargas')


juan.saludar()

class Car {
    constructor(brand, model, age) {
        this.brand = brand
        this.model = model
        this.age = age
    }

    run() {
        console.log(`This Car is brand ${this.brand} and model ${this.model} and age ${this.age} this run.`)
    }
}

const auto = new Car('Ford', 'CMax', 2020)

auto.run()