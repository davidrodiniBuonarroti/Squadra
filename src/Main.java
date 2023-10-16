public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Frank", 2000, "M");
        System.out.println(persona1.toString());
        Persona persona2 = (Persona) persona1.clone();
        persona2.setNome("Paolo");
        System.out.println(persona2.clone());

        Calciatore calciatore1 = new Calciatore("Cristiano", 1985, "M", "Punta", 7, 1000);
        System.out.println(calciatore1.toString());

        Calciatore calciatore2 = (Calciatore) calciatore1.clone();
        calciatore2.addGoal();
        System.out.println(calciatore2.toString());
    }
}