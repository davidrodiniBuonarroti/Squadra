public class Calciatore extends Persona{

    private String ruolo;
    private int nMaglia;
    private int nGoal;

    public Calciatore(String nome, int annoNascita, String sesso,
                      String ruolo, int nMaglia, int nGoal){
        super(nome, annoNascita, sesso);
        this.ruolo = ruolo;
        this.nMaglia = nMaglia;
        this.nGoal = nGoal;
    }

    public String toString(){
        String rit = "\n{";
        rit += this.toStringInner();
        rit += "}\n";
        return rit;
    }

    public String toStringInner(){
        String rit = "\n" + super.toStringInner();
        rit += " Ruolo: " + this.ruolo + ",\n";
        rit += " Numero Maglia: " + this.nMaglia + ",\n";
        rit += " Numero Goal: " + this.nGoal + "\n";
        return rit;
    }
}
