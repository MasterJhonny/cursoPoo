import java.util.ArrayList;
public class Profesor extends Personal {
    String gradoAcademic;
    ArrayList<String> materiasDicta;
    public Profesor(String name, String email, String password, String gradoAcademic) {
        super(name, email, password);
        this.gradoAcademic = gradoAcademic;
        this.materiasDicta = new ArrayList<String>();
    }
}