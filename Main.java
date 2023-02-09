package progetto_gruppo;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        File tmpDir = new File("progetto_gruppo/inventario.ser");
        boolean exists = tmpDir.exists();
        if (exists) {
            inventario = SaveLoad.load();
            System.out.println("Caricato inventario");
        }
        else {
            inventario.aggiungiVeicolo(new Automobile("Fiat", "Panda", "AA123BB", 5));
            inventario.aggiungiVeicolo(new Automobile("Fiat", "Punto", "AA456BB", 3));
            inventario.aggiungiVeicolo(new Camion("Mercedes", "Actros", "AA123CC", 1000));
            inventario.aggiungiVeicolo(new Camion("Mercedes", "Atego", "AA456CC", 500));
            inventario.aggiungiVeicolo(new Moto("Honda", "CBR", "AA123DD", 600));
            inventario.aggiungiVeicolo(new Moto("Honda", "CB", "AA456DD", 500));
            SaveLoad.save(inventario);
            System.out.println("Creato inventario");
        }


        new View(inventario);
        
    }
    
}
