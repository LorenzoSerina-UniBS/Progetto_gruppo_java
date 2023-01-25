package progetto_gruppo;
import java.awt.event.*;  
import javax.swing.*;
import java.awt.*;  


public class AggiungiVeicolo extends Frame implements ActionListener{
        JFrame frame = new JFrame("Aggiungi veicolo");
        JButton b=new JButton("Aggiungi");
        JLabel l1,l2;  

        public AggiungiVeicolo(){
            l1=new JLabel("First Label.");  
            l1.setBounds(50,50, 100,30);  
            l2=new JLabel("Second Label.");  
            l2.setBounds(50,100, 100,30);  
            frame.add(l1); 
            frame.add(l2);  

            b.setBounds(50,150,100, 40);
            b.addActionListener(new ActionListener(){  
                public void actionPerformed(ActionEvent e){
                            
                        }  
                    });  
            frame.add(b);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 300);
            frame.setLayout(null); 
            frame.setVisible(true);
        }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    public static void main(String[] args) {  
        new AggiungiVeicolo();  
    } }  

