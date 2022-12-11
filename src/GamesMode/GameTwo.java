package GamesMode;

import Clases.Tablero;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GameTwo extends JPanel{
    private Tablero t;
    private JLabel i;
    public GameTwo(){
        
        /*this.setLayout(null);
        i=new JLabel(new ImageIcon("Rompecabezas1.jpg"));
        i.setBounds(190, 20, 500, 500);
        add(i);*/
        
        t=new Tablero(190,20);
    }
    public void paint(Graphics g){
        
        t.paint(g);
        //i.paint(g);
    }
}
