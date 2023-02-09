package progetto_gruppo;


import java.awt.event.*;
import javax.swing.*;

public class ModificaVeicolo extends JFrame{

	// JFrame
	static JFrame f;

	// JButton
	static JButton b, b1;

	// Label to display text
	static JTextField l, l1, l2, l3;
    static JLabel e, e1, e2, e3;


    public ModificaVeicolo(Veicolo veicolo, Inventario inventario) {

        f = new JFrame(veicolo.getModello());
        JPanel p = new JPanel();
        e= new JLabel("Marca");
        e1= new JLabel("Modello");
        e2= new JLabel("Targa");

        if (veicolo instanceof Automobile)
        {
            Automobile automobile = (Automobile) veicolo;
            l = new JTextField(automobile.getMarca());
            l1 = new JTextField(automobile.getModello());
            l2 = new JTextField(automobile.getTarga());
            l3 = new JTextField(automobile.getPorte());
            e3= new JLabel("Porte");
            p.add(e);
            p.add(l);
            p.add(e1);
            p.add(l1);
            p.add(e2);
            p.add(l2);
            p.add(e3);
            p.add(l3);

        }
        else if (veicolo instanceof Moto)
        {
            Moto moto = (Moto) veicolo;
            l = new JTextField(moto.getMarca());
            l1 = new JTextField(moto.getModello());
            l2 = new JTextField(moto.getTarga());
            l3 = new JTextField(moto.getCilindrata());
            e3= new JLabel("Cilindrata");
            p.add(e);
            p.add(l);
            p.add(e1);
            p.add(l1);
            p.add(e2);
            p.add(l2);
            p.add(e3);
            p.add(l3);

        }
        else
        {
            Camion camion = (Camion) veicolo;
            l = new JTextField(camion.getMarca() );
            l1 = new JTextField(camion.getModello());
            l2 = new JTextField(camion.getTarga());
            l3 = new JTextField(camion.getPortata());
            e3= new JLabel("Portata");
            p.add(e);
            p.add(l);
            p.add(e1);
            p.add(l1);
            p.add(e2);
            p.add(l2);
            p.add(e3);
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
                SaveLoad.save(inventario);

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

        f.setSize(500, 500);
        f.setVisible(true);


    }

}

