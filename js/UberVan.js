import Car from './Car.js'
class UberVan extends Car {
    constructor(license, driver, typeCardAcepted, material){
        super(license, driver);
        this.typeCardAcepted = typeCardAcepted;
        this.material = material;
    }
}

export default UberVan;