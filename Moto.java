package progetto_gruppo;

public class Moto extends Veicolo {
    private int cilindrata;
 
    public Moto(String marca, String modello, String targa, int cilindrata) {
       super(marca, modello, targa);
       this.cilindrata = cilindrata;
    }
 
    public int getCilindrata() {
       return cilindrata;
    }
    public void setCilindrata(int cilindrata) {
       this.cilindrata = cilindrata;
    }
}