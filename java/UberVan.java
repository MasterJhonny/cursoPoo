import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car {
    Map <String, Map<String, Integer>> typeCardAcepyrd; 
    ArrayList<String> setsMaterial;
    public UberVan(String license, Account driver, Map <String, Map<String, Integer>> typeCardAcepyrd, ArrayList<String> setsMaterial) {
        super(license, driver);
        this.typeCardAcepyrd = typeCardAcepyrd;
        this.setsMaterial = setsMaterial;
        
    }
    
    void printData() {
        System.out.println(" license: " + license);
    }
}

