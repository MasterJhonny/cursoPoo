import java.util.ArrayList;
class Alumno extends Personal {
    String semestre;
    ArrayList<String> materiasCursando;
    public Alumno(String name, String email, String password, String semestre) {
        super(name, email, password);
        this.semestre = semestre;
        this.materiasCursando = new ArrayList<String>();
    }
}