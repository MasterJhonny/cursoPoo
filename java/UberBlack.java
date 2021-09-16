import java.util.ArrayList;
import java.util.Map;

public class UberBlack extends Car {
    Map <String, Map<String, Integer>> typeCardAcepyrd; 
    ArrayList<String> setsMaterial;
    public UberBlack(String license, Account driver, Map <String, Map<String, Integer>> typeCardAcepyrd, ArrayList<String> setsMaterial) {
        super(license, driver);
        this.typeCardAcepyrd = typeCardAcepyrd;
        this.setsMaterial = setsMaterial;
        
    }
    
    void printData() {
        System.out.println(" license: " + license);
    }
}
