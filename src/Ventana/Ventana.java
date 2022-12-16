package Ventana;

import Paneles.GamesMode;
import Paneles.Principal;
import java.awt.BorderLayout;
import javax.swing.JFrame;



public class Ventana extends JFrame {

    private Principal p;
        public Ventana(){
            
            p= new Principal(this);
            p.setLayout(null); // desactivamos layout por defecto
            
            this.setTitle("Rompezabezas");
            this.setSize(900,900);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setLayout(new BorderLayout());
            this.add(p,BorderLayout.CENTER);
            this.setVisible(true);
            
        }
}


    /*public void lvlPuntero(KeyEvent e){
        
        nivelactual=aux;
        System.out.println("lvl: "+nivelactual);
        
        if(e.getKeyCode()==40 && nivelactual==1){
            p.MovPuntero(325, 534);
            aux++;
            
        }else if(e.getKeyCode()==40 && nivelactual==2){
            p.MovPuntero(380, 595);//lvl3
            aux++;
        }else if(e.getKeyCode()==40 && nivelactual==3){
            p.MovPuntero(380, 595);
        }
        else if(e.getKeyCode()==38 && nivelactual==3){
            p.MovPuntero(325, 534);
            aux--;  
        }else if(e.getKeyCode()==38 && nivelactual==2){
            p.MovPuntero(220, 475); //lvl1
            aux--;
        }
        else if(e.getKeyCode()==38 && nivelactual==1){
            p.MovPuntero(372, 415);//lvl0
            aux--;
        }
        if(nivelactual==0 && e.getKeyCode()==40){
            p.MovPuntero(220, 475);
            aux++;
        }
    }*/
    
    /*public void EnterPanel(KeyEvent e){
            if(e.getKeyCode()==10 && nivelactual==0){
            p.MovPuntero(30, 30);
            
            mo=new ModoJuegoOne();
            mo.setSize(900,900);
            mo.setLocation(0, 0);
            
            p.removeAll();
            p.add(mo,BorderLayout.CENTER);
            p.revalidate();
            p.repaint();
            
        }
         if(e.getKeyCode()==10 && nivelactual==1){
            p.MovPuntero(30, 30);
            
            gm=new GamesMode();
            gm.setSize(900,900);
            gm.setLocation(0, 0);
            
            p.removeAll();
            p.add(gm,BorderLayout.CENTER);
            p.revalidate();
            p.repaint();
            
        }   
    }*/