import java.util.ArrayList;
class Ayudante extends Personal {
    String semestre;
    ArrayList<String> materiasDicta;
    public Ayudante(String name, String email, String password, String semestre) {
        super(name, email, password);
        this.semestre = semestre;
        this.materiasDicta = new ArrayList<String>();
    }
}