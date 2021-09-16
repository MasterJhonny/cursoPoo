function Card(license, driver) {
    this.id = null;
    this.license = license;
    this.driver = driver;
    this.passengenger = null;
}

Card.prototype.printData = function() {
    console.log(`Card license: ${this.license}`)
    console.log('Card driver: ' + this.driver.name)
}

export default Card;