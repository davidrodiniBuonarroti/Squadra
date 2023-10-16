public class Persona {

    private String nome;
    private int annoNascita;
    private String sesso;

    public Persona(String nome, int annoNascita, String sesso){
        this.nome = nome;
        this.annoNascita = annoNascita;
        this.sesso = sesso;
    }

    public String toString(){
        String rit = "{Nome: " + this.nome + ",\n";
        rit += "Anno di nascità: " + this.annoNascita + ",\n";
        rit += "Sesso: " + this.sesso + "}\n";
        return rit;
    }
}
