package progetto_gruppo;
import java.io.*;


public class SaveLoad {
    public static void save(Inventario inventario) {
        try {
            FileOutputStream fileOut = new FileOutputStream("progetto_gruppo/inventario.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(inventario);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in inventario.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    public static Inventario load() {
        Inventario inventario = null;
        try {
            FileInputStream fileIn = new FileInputStream("progetto_gruppo/inventario.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            inventario = (Inventario) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return new Inventario();
        } catch (ClassNotFoundException c) {
            System.out.println("Inventario class not found");
            c.printStackTrace();
            return new Inventario();
        }
        return inventario;
    }


}
