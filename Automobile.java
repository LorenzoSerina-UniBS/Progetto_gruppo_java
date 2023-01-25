package progetto_gruppo;

public class Automobile extends Veicolo {
    private int num_porte;
 
    public Automobile(String marca, String modello, String targa, int num_porte) {
       super(marca, modello, targa);
       this.num_porte = num_porte;
    }
 
    public int getPorte() {
       return num_porte;
    }
    public void setPorte(int num_porte) {
       this.num_porte = num_porte;
    }
    
 }
    