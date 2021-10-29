import java.util.HashMap;
import java.util.Map;
public class Main {
    
    public static void main(String[] args) {
        
        // instantiate the objetc
        /*Car car = new Car("QWE8989", new Account("Andres Herrera", "2343299"));
        car.passegenger = 23;
        car.printData();

        Car car1 = new Car("WEPI77566", new Account("Andrea Herrera", "9998987"));
        car1.passegenger = 12;
        car1.printData();*/

        UberX car1 = new UberX("ASDF234", new Driver("Andres Herrera", "9998987"), "toyota", "2020");
        car1.setPassenger(4);
        car1.printData();
        // car1.setPassenger(4);
        // car1.printData();
        // System.out.println("El nombre del conductor es: " + car1.driver.name); 

        UberPull carPull = new UberPull("DFGJ3456", new Driver("Frederyk Taylor", "4444566"), "Nisan", "2021");
        carPull.setPassenger(6);
        carPull.printData();







        // HashMap<Integer, String> map = new HashMap<Integer, String>();

        // Map<Integer, String> map2 = new HashMap<Integer, String>();

        // map2.put(1, "hola1");
        // map2.put(2, "hola2");
        // map2.put(3, "hola3");
        // map2.put(4, "hola4");

        // System.out.println(map2.get(3)); 
    }
}
