package progetto_gruppo;

// Importing required classes
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ModificaVeicolo extends JFrame{

	// JFrame
	static JFrame f;

	// JButton
	static JButton b, b1;

	// Label to display text
	static JTextField l, l1, l2, l3;


    public ModificaVeicolo(Veicolo veicolo, Inventario inventario) {

        f = new JFrame(veicolo.getModello());
        JPanel p = new JPanel();

        if (veicolo instanceof Automobile)
        {
            Automobile automobile = (Automobile) veicolo;
            l = new JTextField("Marca: " + automobile.getMarca());
            l1 = new JTextField("Modello: " + automobile.getModello());
            l2 = new JTextField("Targa: " + automobile.getTarga());
            l3 = new JTextField("Porte: " + automobile.getPorte());
            p.add(l);
            p.add(l1);
            p.add(l2);
            p.add(l3);

        }
        else if (veicolo instanceof Moto)
        {
            Moto moto = (Moto) veicolo;
            l = new JTextField("Marca: " + moto.getMarca());
            l1 = new JTextField("Modello: " + moto.getModello());
            l2 = new JTextField("Targa: " + moto.getTarga());
            l3 = new JTextField("Cilindrata: " + moto.getCilindrata());
            p.add(l);
            p.add(l1);
            p.add(l2);
            p.add(l3);

        }
        else
        {
            Camion camion = (Camion) veicolo;
            l = new JTextField("Marca: " + camion.getMarca() );
            l1 = new JTextField("Modello: " + camion.getModello());
            l2 = new JTextField("Targa: " + camion.getTarga());
            l3 = new JTextField("Portata: " + camion.getPortata());
            p.add(l);
            p.add(l1);
            p.add(l2);
            p.add(l3);
                    
        }


        b = new JButton("Modifica");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Inventario inventario = new Inventario();
                
                if (veicolo instanceof Automobile)
                {
                    Automobile automobile = new Automobile(l.getText(), l1.getText(), l2.getText(), Integer.parseInt(l3.getText()));
                    inventario.aggiungiVeicolo(automobile);
                    new MostraVeicolo(automobile, inventario);
                }

                else if (veicolo instanceof Moto)
                {
                    Moto moto = new Moto(l.getText(), l1.getText(), l2.getText(), Integer.parseInt(l3.getText()));
                    inventario.aggiungiVeicolo(moto);
                    new MostraVeicolo(moto, inventario);
                }

                else
                {
                    Camion camion = new Camion(l.getText(), l1.getText(), l2.getText(), Integer.parseInt(l3.getText()));
                    inventario.aggiungiVeicolo(camion);
                    new MostraVeicolo(camion, inventario);
                }
                inventario.rimuoviVeicolo(veicolo);
                f.dispose();
            }
        });

        b1 = new JButton("Indietro");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MostraVeicolo(veicolo, inventario);
                f.dispose();
            }
        });
        //b2 = new JButton("Torna indietro");

        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));


		// Adding buttons and textfield to panel
		p.add(b);
		p.add(b1);
		//p.add(b2);
        f.add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setSize(300, 300);
        f.setVisible(true);


    }

}

