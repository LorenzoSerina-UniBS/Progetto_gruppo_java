package progetto_gruppo;

import javax.swing.event.*;

import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class View extends JFrame{

    Inventario inventario;
    JFrame f;
	
	//lists
	JList l;
    JButton b;
	
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

        l= new JList(data);
        l.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e)
            {
                new MostraVeicolo(inventario.getVeicolo(l.getSelectedIndex()), inventario);
                f.dispose();
        
            }
        });
        
        b = new JButton("Aggiungi veicolo");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AggiungiVeicolo(inventario);
                f.dispose();
            }
        });


        p.add(l);
		p.add(b);


		f.add(p);

		// Frame Size
		f.setSize(500, 200);
		// Frame Visible = true
		f.setVisible(true);
		
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

