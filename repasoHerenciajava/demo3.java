import java.util.ArrayList;
public class demo3 {
    public static void main(String[] args) {
        System.out.println("hola Mundillo...");

        Alumno juan = new Alumno("Juan Herrera", "juandc2342gmail.com", "2354patito", "tercer Semestre");
        juan.printData();
        juan.age  = 34;
        System.out.println("");
        // System.out.println(juan.name + " " + juan.age);

        Profesor carlos = new Profesor("Carlos Maceres", "34macers@gmail.com", "1234where", "Ing.");
        carlos.printData();
        System.out.println("");
        Ayudante pinto = new Ayudante("Daniel Pinto", "3245@idjhgmail.com", "paitiofeo", "cuarto semestre");
        pinto.printData();
    }
}