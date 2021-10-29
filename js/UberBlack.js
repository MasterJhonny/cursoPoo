import Car from './Car.js'
class UberBlack extends Car {
    constructor(license, driver, typoCardAcepted, material){
        super(license, driver);
        this.typoCardAcepted = typoCardAcepted;
        this.material = material;
    }
}

export default UberBlack;