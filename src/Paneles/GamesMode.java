
package Paneles;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamesMode extends JPanel{
    private JLabel back, mo, md, ls;
    public GamesMode(){
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        
        back=new JLabel("Volver al menú");
        back.setBounds(60,40,150,45);
        back.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        back.setForeground(Color.WHITE);
        add(back);
        
        ls=new JLabel("Seleccione el modo de juego");
        ls.setBounds(230,180+75,410,45);
        ls.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,33));
        ls.setForeground(Color.WHITE);
        add(ls);
        
        mo=new JLabel("Modo de juego uno");
        mo.setBounds(330,360+75-50,410,45);
        mo.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,25));
        mo.setForeground(Color.WHITE);
        add(mo);
        
        md=new JLabel("Modo de juego dos");
        md.setBounds(330,430+75-50,410,45);
        md.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,25));
        md.setForeground(Color.WHITE);
        add(md);
        
        
        
    }
    
    public void paint (Graphics g){
        super.paint(g);
    }
}
