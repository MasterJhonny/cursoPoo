public class UberPull extends Car {
    String brand;
    String model;
    public UberPull(String license, Account driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
    
    void printData() {
        System.out.println(" license: " + license + " model: " + model);
    }
}
