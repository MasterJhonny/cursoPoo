public class Persona {
    String name;
    Integer age;
    String description;
    String email;
    public Persona(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    void saludar(){
        System.out.println("hello my name is " + name + ", have " + age + " years");
    }
}
