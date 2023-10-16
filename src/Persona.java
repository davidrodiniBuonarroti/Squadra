public class Persona {

    private String nome;
    private int annoNascita;
    private String sesso;
    private int nScarpe;

    public Persona(String nome, int annoNascita, String sesso, int nScarpe){
        this.nome = nome;
        this.annoNascita = annoNascita;
        this.sesso = sesso;
        this.nScarpe = nScarpe;
    }

    public Persona(Persona persona){
        this.nome = persona.nome;
        this.annoNascita = persona.annoNascita;
        this.sesso = persona.sesso;
        this.nScarpe = persona.nScarpe;
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

    public int getNScarpe(){
        return this.nScarpe;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setnScarpe(int nScarpe){
        this.nScarpe = nScarpe;
    }

    public Object clone(){
        return new Persona(this.nome, this.annoNascita, this.sesso, this.nScarpe);
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
        rit += " Numero scarpe: " + this.nScarpe + ",\n";
        return rit;
    }


}
