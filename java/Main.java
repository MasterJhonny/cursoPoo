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

        UberX car1 = new UberX("ASDF234", new Account("Andres Herrera", "9998987"), "toyota", "2020");

        car1.printData();

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        Map<Integer, String> map2 = new HashMap<Integer, String>();

        map2.put(1, "hola1");
        map2.put(2, "hola2");
        map2.put(3, "hola3");
        map2.put(4, "hola4");

        System.out.println(map2.get(3)); 
    }
}
