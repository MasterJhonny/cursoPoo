public class Car {
    Integer id;
    String license;
    Account driver;
    Integer passegenger;

    public Car(String license, Account driver) {
        this.license = license;
        this.driver = driver;
    }

    void printData() {
        System.out.println("Car License: " + license);
        System.out.println("Car Name Driver : " + driver.name);
        System.out.println("Car Passegenger: " + passegenger);
        System.out.println("");
    }
}


