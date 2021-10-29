class Personal {
    String name;
    String email;
    String password;
    Integer age;
    public Personal (String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    void printData() {
        System.out.println("My name is " + name);
        System.out.println("and email is " + email);
    }
}