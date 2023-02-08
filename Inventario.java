package progetto_gruppo;
// L'inventario dei veicoli. Questa classe dovrebbe contenere una lista di oggetti di classe “Veicolo” e fornire metodi per aggiungere, rimuovere, cercare e visualizzare i veicoli nell'inventario.
public class Inventario {
    private Veicolo[] veicoli;
    private int numeroVeicoli;
    public Inventario() {
        veicoli = new Veicolo[100];
        numeroVeicoli = 0;
    }
    public void aggiungiVeicolo(Veicolo veicolo) {
        veicoli[numeroVeicoli] = veicolo;
        numeroVeicoli++;
    
    }
    public void rimuoviVeicolo(Veicolo veicolo) {
        int i = 0;
        while (i < numeroVeicoli && veicoli[i] != veicolo) {
            i++;
        }
        if (i < numeroVeicoli) {
            veicoli[i] = veicoli[numeroVeicoli - 1];
            numeroVeicoli--;
        }
    }
    public void visualizzaVeicoli() {
        for (int i = 0; i < numeroVeicoli; i++) {
            System.out.println(veicoli[i]);
        }
    }
    public int getNumeroVeicoli() {
        return numeroVeicoli;
    }
    public Veicolo getVeicolo(int i) {
        return veicoli[i];
    }
    
}
