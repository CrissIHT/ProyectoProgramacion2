package Paneles;

import GamesMode.GameOne;
import GamesMode.GameTwo;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Jugar extends JPanel{
    private JLabel back;
    private int gamemode;
    private GameOne go;
    private GameTwo gt;
    public Jugar(JPanel p){
        
        
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        
        /*back=new JLabel("Volver al menú");
        back.setBounds(60,40,150,45);
        back.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        back.setForeground(Color.WHITE);
        add(back);
        
        back.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                System.out.println(get());
            }
        });*/
        
        
        
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        if(gamemode==0){
            gt=new GameTwo();
            gt.paint(g);
        }else{
            go=new GameOne();
            go.paint(g);
        }
        repaint();
    }
    
    public void backPanel(){
        for (Component component : this.getComponents()) {
                
                component.setVisible(false);
                component.setEnabled(false);
                }
    }
    
    public void setGame(int gm){
        if(gm==1){
            gamemode=1;
        }else{
            gamemode=0;
        }
    }

    public int get(){
        return gamemode;
    }
        
}
