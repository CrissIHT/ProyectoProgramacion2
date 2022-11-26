package Paneles;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Principal extends JPanel{
        private JFrame vent;
        private GamesMode pgm;
        private Jugar paneljugar;
        private ComoJugar pcj;
        private JLabel tm, j, sj,cj, e, da;
        private String s;
        private int x=372,y=415;
        
        
        public Principal(JFrame v){
            vent=v;
            this.setBackground(Color.DARK_GRAY);
            // TÍTULO DEL MENÚ
            
            tm=new JLabel("Rompecabezas");
            tm.setBounds(175, 0, 511, 150);
            tm.setFont(new Font(Font.SANS_SERIF,Font.BOLD,70));
            tm.setForeground(Color.WHITE);
            add(tm);
            
            // OPCIONES DEL MENÚ
            
            j=new JLabel("Jugar");
            j.setBounds(400,400,93,45);
            j.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,35));
            j.setForeground(Color.WHITE);
            add(j);
            
            sj=new JLabel("Seleccionar modo de juego");
            sj.setBounds(250,460,410,45);
            sj.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,35));
            sj.setForeground(Color.WHITE);
            add(sj);
            
            cj=new JLabel("Cómo jugar");
            cj.setBounds(355,520,410,45);
            cj.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,35));
            cj.setForeground(Color.WHITE);
            add(cj);
            
            e=new JLabel("Salir");
            e.setBounds(410,580,410,45);
            e.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,35));
            e.setForeground(Color.WHITE);
            add(e);
            
            //creadores
            
            da=new JLabel("created by @crissiht @ingridingridd @pepenaxoo01");
            da.setBounds(570,825,300,20);
            da.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,13));
            da.setForeground(Color.WHITE);
            add(da);
            
            j.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                    PanelJugar();
                }
            });    
            
            sj.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                    PanelGamesMode();
                }
            });            
            
            e.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                    vent.dispose();
                }
            });   
            
            cj.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                    PanelComoJugar();
                }
            });             
        }
        
        @Override
        public void paint(Graphics g){
            super.paint(g);
            g.setColor(Color.white);
            /*g.fillRect(400, 415, 92, 25);
            g.fillRect(250, 473, 410, 25);
            g.fillRect(355, 535, 178, 25);
            g.fillRect(410, 590, 74, 25);*/
        }
        
        /*public void PaintPuntero(int x, int y, Graphics g){
            g.setColor(Color.WHITE);
            int[] xPoints={x,x+20,x};
            int[] yPoints={y,y+10,y+20};
            g.fillPolygon(xPoints, yPoints, 3);
            this.repaint();
        }
        
        public void MovPuntero(int x,int y){
            this.x=x; this.y=y;
        }*/
    public void PanelComoJugar(){
        pcj=new ComoJugar();
        pcj.setSize(900,900);
        pcj.setLocation(0,0);
        
        removeAll();
        add(pcj, BorderLayout.CENTER);
        revalidate();
        repaint();
    }    
    
    public void PanelGamesMode(){
        pgm=new GamesMode();
        pgm.setSize(900,900);
        pgm.setLocation(0,0);
        
        removeAll();
        add(pgm, BorderLayout.CENTER);
        revalidate();
        repaint();
    }    
        
    public void PanelJugar(){
        paneljugar=new Jugar();
        paneljugar.setSize(900, 900);
        paneljugar.setLocation(0, 0);
        
        removeAll();
        add(paneljugar, BorderLayout.CENTER);
        revalidate();
        repaint();
    }  

    public void DesactivarPrincipal(){
 
    }
    
    public void settVen(JFrame v){
        vent=v;
    }

    /*@Override
    public void mouseClicked(MouseEvent e) {
       System.out.println("hola");   
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //System.out.println("hola");    
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }*/
}