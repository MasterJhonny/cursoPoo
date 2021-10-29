public class UberPull extends Car {
    String brand;
    String model;
    Integer passegenger;
    public UberPull(String license, Driver driver, String brand, String model) {
        super(license, driver);
        this.brand = brand;
        this.model = model;
        this.passegenger = null;
    }
    // @Override
    // void printData() {
    //     System.out.println(" license: " + license + " model: " + model + " passegenger: " + passegenger);
    // }
    @Override
    void printData() {
        super.printData();
        System.out.println("Car passegenger: " + passegenger);
    }
    @Override
    public void setPassenger(Integer passegenger){
        if(passegenger == 6){
            this.passegenger = passegenger;
        } else {
            System.out.println("El numero de passegenger: debe ser igula a seis");
        }
    }
}
