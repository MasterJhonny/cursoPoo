class Card {

    constructor(license, driver) {
        this.id = null;
        this.license = license;
        this.driver = driver;
        this.passengenger = null;
    }

    printDataCar() {
        let { license, driver, passengenger } = this
        console.log(`Card license: ${license}`)
        console.log(`Card passengenger: ${passengenger}`)
        console.group("Card Diver:")
        console.table(driver)
        console.groupEnd()
    }
}


export default Card;