import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        String nombre = "";
        // int num2 = 0;
        int result = 0;
        Scanner entrada = new Scanner(System.in);
        //System.out.println("Ingresa el primer valor: ");
        nombre = entrada.nextLine();

        // System.out.println("Ingresa el second valor: ");
        // num2 = entrada.nextInt();

        System.out.println("Hello my name is " + nombre);
    }
}
