
package Paneles;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamesMode extends JPanel{
    private JLabel back, mo, md, ls;
    public GamesMode(Principal p){

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
        
        back.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                
                for (Component component : p.getComponents()) {
                
                component.setVisible(true);
                component.setEnabled(true);
                backPanel();
                revalidate();
                
                }
            }
        });
        
        mo.addMouseListener(new MouseAdapter(){
            
            public void mouseClicked(MouseEvent e){
               p.set(1);
               System.out.println("Modo de juego uno seleccionado");
            }
        });
        
        md.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
               p.set(0);
               System.out.println("Modo de juego dos seleccionado"); 
            }
        });
    }
    
    public void paint (Graphics g){
        super.paint(g);
    }
    
    public void backPanel(){
        
        for (Component component : this.getComponents()) {
                component.setVisible(false);
                component.setEnabled(false);
                }
    }
    
    
}
