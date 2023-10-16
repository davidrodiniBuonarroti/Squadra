public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Frank", 2000, "M");
        System.out.println(persona1.toString());
        Persona persona2 = (Persona) persona1.clone();
        persona2.setNome("Paolo");
        System.out.println(persona2.clone());
    }
}