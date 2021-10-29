public class Car {
    Integer id;
    String license;
    Driver driver;
    private Integer passegenger;

    public Car(String license, Driver driver) {
        this.license = license;
        this.driver = driver;
    }

    void printData() {
        System.out.print("Car License: " + license + ", Driver : " + driver.name);
        System.out.println(passegenger != null ? ", Passegenger: " + passegenger : "");
    }
    public Integer getPassenger(){
        return passegenger;
    }
    public void setPassenger(Integer passegenger){
        if(passegenger == 4){
            this.passegenger = passegenger;
        } else {
            System.out.println("El numero de passegenger: debe ser igula a cuatro");
        }
    }
}


