package Ventana;

import Paneles.Principal;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class Ventana extends JFrame{
        public Ventana(){
            Principal p= new Principal();
            this.setTitle("Rompezabezas");
            this.setSize(800,800);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(new BorderLayout());
            this.add(p,BorderLayout.CENTER);
            this.setVisible(true);
        }
}