public class Persona {

    private String nome;
    private int annoNascita;
    private String sesso;

    public Persona(String nome, int annoNascita, String sesso){
        this.nome = nome;
        this.annoNascita = annoNascita;
        this.sesso = sesso;
    }

    public Persona(Persona persona){
        this.nome = persona.nome;
        this.annoNascita = persona.annoNascita;
        this.sesso = persona.sesso;
    }

    public String getNome(){
        return this.nome;
    }

    public int getAnnoNascita(){
        return this.annoNascita;
    }

    public String getSesso(){
        return this.sesso;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Object clone(){
        return new Persona(this);
    }

    public String toString(){
        String rit = "{\n";
        rit += this.toStringInner();
        rit += "}\n";
        return rit;
    }

    public String toStringInner(){
        String rit = " Nome: " + this.nome + ",\n";
        rit += " Anno di nascità: " + this.annoNascita + ",\n";
        rit += " Sesso: " + this.sesso + ",\n";
        return rit;
    }


}
