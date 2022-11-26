
package Paneles;

import Clases.Tablero;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ModoJuegoOne extends JPanel{
    private JLabel back;
    private Tablero t;
    public ModoJuegoOne(){
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        back=new JLabel("Volver al menú");
        back.setBounds(60,18,150,45);
        back.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        back.setForeground(Color.WHITE);
        add(back);
        t=new Tablero(195,500);
        
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        t.paint(g);
    }
}
