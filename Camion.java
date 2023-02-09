package progetto_gruppo;

public class Camion extends Veicolo implements java.io.Serializable{
    private int portata;
 
    public Camion(String marca, String modello, String targa, int portata) {
       super(marca, modello, targa);
       this.portata = portata;
    }
 
    public int getPortata() {
       return portata;
    }
    public void setPortata(int portata) {
       this.portata = portata;
    }
}