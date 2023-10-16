public class Calciatore extends Persona{

    private String ruolo;
    private int nMaglia;
    private int nGoal;

    public Calciatore(String nome, int annoNascita, String sesso, int nScarpe,
                      String ruolo, int nMaglia, int nGoal){
        super(nome, annoNascita, sesso, nScarpe);
        this.ruolo = ruolo;
        this.nMaglia = nMaglia;
        this.nGoal = nGoal;
    }

    public Calciatore(Calciatore calciatore){
        //Chiamo il costruttore per copia di Persona
        //Calciatore is a Persona
        super(calciatore);
        this.ruolo = calciatore.ruolo;
        this.nMaglia = calciatore.nMaglia;
        this.nGoal = calciatore.nGoal;
    }



    public String getRuolo(){
        return this.ruolo;
    }

    public int getNMaglia(){
        return this.nMaglia;
    }

    public int getNGoal(){
        return this.nGoal;
    }

    public void setRuolo(String ruolo){
        this.ruolo = ruolo;
    }

    public void setNMaglia(int nMaglia){
        this.nMaglia = nMaglia;
    }

    public void addGoal(){
        this.nGoal++;
    }

    public Object clone(){

        Calciatore calciatore = new Calciatore(this);

        /*calciatore.ruolo = this.ruolo;
        calciatore.nMaglia = this.nMaglia;
        calciatore.nGoal = this.nGoal;*/
        return calciatore;
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
