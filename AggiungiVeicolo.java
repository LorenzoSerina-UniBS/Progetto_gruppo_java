package progetto_gruppo;
// Importing required classes
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AggiungiVeicolo extends JFrame{


	// JFrame
	static JFrame f;
    static JCheckBox cb1, cb2, cb3;

	// JButton
	static JButton b, b1;

	// Label to display text
	static JTextField l, l1, l2, l3;
    static JLabel e, e1, e2, e3;


    public AggiungiVeicolo(Inventario inventario) {

        f = new JFrame("Aggiungi Veicolo");

        JPanel p = new JPanel();
        
        e= new JLabel("Marca");
        e1= new JLabel("Modello");
        e2= new JLabel("Targa");
        e3= new JLabel();

        cb1 = new JCheckBox("Automobile");
        cb2 = new JCheckBox("Moto");
        cb3 = new JCheckBox("Camion");
        
        l = new JTextField();
        l1 = new JTextField();
        l2 = new JTextField();
        l3 = new JTextField();
        l3.setVisible(false);


        b = new JButton("Aggiungi");
        b.setVisible(false);

        b1 = new JButton("Indietro");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new View(inventario);
                f.dispose();
            }
        });

        
        cb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (cb1.isSelected())
                {
                    cb2.setSelected(false);
                    cb3.setSelected(false);
                    e3.setText("Porte");
                    e3.setVisible(true);
                    l3.setVisible(true);
                    b.setVisible(true);

                    b.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Automobile automobile = new Automobile(l.getText(), l1.getText(), l2.getText(), Integer.parseInt(l3.getText()));
                            inventario.aggiungiVeicolo(automobile);
                            new MostraVeicolo(automobile, inventario);
                            f.dispose();
                        }
                    });
                    

                }
            }
        });
        cb2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (cb2.isSelected())
                {
                    cb1.setSelected(false);
                    cb3.setSelected(false);
                    e3.setText("Cilindrata");
                    e3.setVisible(true);
                    l3.setVisible(true);
                    b.setVisible(true);

                    b.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Moto moto = new Moto(l.getText(), l1.getText(), l2.getText(), Integer.parseInt(l3.getText()));
                            inventario.aggiungiVeicolo(moto);
                            new MostraVeicolo(moto, inventario);
                            f.dispose();

                        }
                    });
                }
            }
        });

        cb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (cb3.isSelected())
                {
                    cb1.setSelected(false);
                    cb2.setSelected(false);
                    e3.setText("Carico");
                    e3.setVisible(true);
                    l3.setVisible(true);
                    b.setVisible(true);

                    b.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                            Camion camion = new Camion(l.getText(), l1.getText(), l2.getText(), Integer.parseInt(l3.getText()));
                            inventario.aggiungiVeicolo(camion);
                            new MostraVeicolo(camion, inventario);
                            f.dispose();
                        }
                    });
                }
            }
        });



        //b2 = new JButton("Torna indietro");

        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));


		// Adding buttons and textfield to panel
        p.add(e);
        p.add(l);
        p.add(e1);
        p.add(l1);
        p.add(e2);
        p.add(l2);
        p.add(cb1);
        p.add(cb2);
        p.add(cb3);
        p.add(e3);
        p.add(l3);
        p.add(b);
        p.add(b1);
        
		//p.add(b2);
        f.add(p);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setSize(300, 300);
        f.setVisible(true);


    }

}

