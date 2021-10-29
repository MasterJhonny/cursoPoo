class Car {
    constructor(license, driver) {
        this.id = null;
        this.license = license;
        this.driver = driver;
        this.passengenger = null;
    }
    
    printData() {
        console.log(`Card license: ${this.license}`);
        console.log('Card driver: ' + this.driver.name);
    }
    get getPassenger(){
        return this.passengenger;
    }
    set setPassenger(pasenger) {
        if(pasenger === 4){
            this.passengenger = pasenger;
        } else {
            console.error("passengenger dese ser: 4")
        }
    }
}


export default Car;