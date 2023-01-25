package progetto_gruppo;

import java.awt.event.*;  
import javax.swing.*;
// interfaccia grafica che permetta all'utente di inserire nuovi veicoli, visualizzare i veicoli esistenti e eliminare veicoli. Realizzato con JavaSwing.

public class View {
  
    
    JFrame frame = new JFrame("Inventario");
    JButton b=new JButton("Aggiungi veicolo");
    public View(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 800);
        frame.setVisible(true);
        b.setBounds(150,150,100, 40);
        b.addActionListener(new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                        
                    }  
                });  
        frame.add(b);
    }
        
    
}
