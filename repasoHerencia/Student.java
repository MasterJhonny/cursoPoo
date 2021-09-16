public class Student extends Persona {
    String curso;
    Integer materias;
    public Student(String name, Integer age, String curso, Integer materias) {
        super(name, age);
        this.curso = curso;
        this.materias = materias;
    }
}
