package progetto_gruppo;

import java.awt.event.*;
import javax.swing.*;

public class MostraVeicolo extends JFrame {

	// JFrame
	static JFrame f;

	// JButton
	static JButton b, b1, b2;

	// Label to display text
	static JLabel l, l1, l2, l3;


    public MostraVeicolo(Veicolo veicolo, Inventario inventario) {

        f = new JFrame(veicolo.getModello());
        JPanel p = new JPanel();

        if (veicolo instanceof Automobile)
        {
            Automobile automobile = (Automobile) veicolo;
            l = new JLabel("Marca: " + automobile.getMarca());
            l1 = new JLabel("Modello: " + automobile.getModello());
            l2 = new JLabel("Targa: " + automobile.getTarga());
            l3 = new JLabel("Porte: " + automobile.getPorte());
            p.add(l);
            p.add(l1);
            p.add(l2);
            p.add(l3);

        }
        else if (veicolo instanceof Moto)
        {
            Moto moto = (Moto) veicolo;
            l = new JLabel("Marca: " + moto.getMarca());
            l1 = new JLabel("Modello: " + moto.getModello());
            l2 = new JLabel("Targa: " + moto.getTarga());
            l3 = new JLabel("Cilindrata: " + moto.getCilindrata());
            p.add(l);
            p.add(l1);
            p.add(l2);
            p.add(l3);

        }
        else
        {
            Camion camion = (Camion) veicolo;
            l = new JLabel("Marca: " + camion.getMarca() );
            l1 = new JLabel("Modello: " + camion.getModello());
            l2 = new JLabel("Targa: " + camion.getTarga());
            l3 = new JLabel("Portata: " + camion.getPortata());
            p.add(l);
            p.add(l1);
            p.add(l2);
            p.add(l3);
                    
        }


        b = new JButton("Elimina Veicolo");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inventario.rimuoviVeicolo(veicolo);
                new View(inventario);
                f.dispose();
            }
        });
        b1 = new JButton("Modifica Veicolo");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ModificaVeicolo(veicolo, inventario);
                f.dispose();
            }
        });
        b2 = new JButton("Indietro");
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new View(inventario);
                f.dispose();
            }
        });

        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));


		// Adding buttons and textfield to panel
		p.add(b);
		p.add(b1);
		p.add(b2);
        f.add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setSize(500, 500);
        f.setVisible(true);


    }

}
