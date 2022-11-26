package Paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jugar extends JPanel{
    private final JLabel back;
    public Jugar(){
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        
        back=new JLabel("Volver al menú");
        back.setBounds(60,40,150,45);
        back.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        back.setForeground(Color.WHITE);
        add(back);
        
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
    }
}
