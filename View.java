package progetto_gruppo;

import javax.swing.event.*;
import javax.swing.*;

public class View extends JFrame implements ListSelectionListener{

    Inventario inventario;
    JFrame f;
	
	//lists
	JList b;
	
	// Constructor
	View(Inventario inventario)
	{
        this.inventario = inventario;
		// Frame initialization
		f = new JFrame();

		// Frame Title
		f.setTitle("Inventario");
        int numero_veicoli= inventario.getNumeroVeicoli();
        JPanel p =new JPanel();		
		//create a new label
		//JLabel l= new JLabel("select your birthday");
        //l1= new JLabel();

		// Data to be displayed in the JTable
        String[] data = new String[numero_veicoli];
        for (int i = 0; i < numero_veicoli ; i++) {
            Veicolo veicolo = inventario.getVeicolo(i);

            data[i] = "Marca: " + veicolo.getMarca() +" Modello: "+ veicolo.getModello() + " Targa: "+ veicolo.getTarga();
        }

        b= new JList(data);
        b.setSelectedIndex(2);
        b.addListSelectionListener(this);

        p.add(b);
		

		f.add(p);

		// Frame Size
		f.setSize(500, 200);
		// Frame Visible = true
		f.setVisible(true);
		
	}

	public void valueChanged(ListSelectionEvent e)
	{
		new MostraVeicolo(inventario.getVeicolo(b.getSelectedIndex()), inventario);
        f.dispose();

	}
	
	// Driver method
	public static void main(String[] args)
	{
        Inventario inventario = new Inventario();
        inventario.aggiungiVeicolo(new Automobile("Fiat", "Panda", "AA123BB", 3));
        inventario.aggiungiVeicolo(new Moto("Ducati", "Diavel v4", "BB123CC",3000));
        inventario.aggiungiVeicolo(new Camion("Fiat", "Panda", "CC123DD", 1000));
		new View(inventario);
	}

}

