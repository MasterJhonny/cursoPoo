import java.util.HashMap;
public class Demo {
    public static void main(String[] args) {
        Persona juan = new Persona("Juan Mamani", 34);
        // juan.saludar();

        Student maira = new Student("Maria Herrera", 23, "6to de Secundaria", 7);

        // maira.saludar();

        //Map <String, Integer> map = new HashMap<String, Integer>();
        HashMap<String, Persona> lista = new HashMap<String, Persona>();

        lista.put("1", new Persona("Mario Mamani", 23));
        lista.put("2", new Persona("Maria Mamani", 23));
        lista.put("tercer", new Persona("Rebeca Mamani", 23));
        lista.put("4", new Persona("Tereza Mamani", 23));
        // for(int i = 1; i <= lista.size(); i++) {
        //     System.out.println(lista.get(i).name);
        // }
        System.out.println(lista.get("tercer").name);
    }
}
