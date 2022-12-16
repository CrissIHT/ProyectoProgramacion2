package Paneles;


import GamesMode.GameOne;
import GamesMode.GameTwo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
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
        private int gamemode;
        public Principal(JFrame v){
            vent=v;
            this.setLayout(null);
            this.setBackground(Color.DARK_GRAY);
            // TÍTULO DEL MENÚ
            
            tm=new JLabel("Rompecabezas");
            tm.setBounds(175, 50, 511, 150);
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
            
    
            pcj=new ComoJugar(this);
            pcj.setSize(900,900);
            pcj.setLocation(0,0);
            
            paneljugar=new Jugar(this);
            paneljugar.setSize(900, 900);
            paneljugar.setLocation(0, 0);
            
            pgm=new GamesMode(this);
            pgm.setSize(900,900);
            pgm.setLocation(0,0);
        }
        
        @Override
        public void paint(Graphics g){
            super.paint(g);
            g.setColor(Color.white);

        }
        
    public void PanelComoJugar(){
    
        DesactivarPrincipal();
        
        
        add(pcj, BorderLayout.CENTER);
        revalidate();
        repaint();
    }    
    
    public void PanelGamesMode(){

        DesactivarPrincipal(); 
        this.add(pgm, BorderLayout.CENTER);
        revalidate();
        repaint();       
    }    
        
    public void PanelJugar(){

        paneljugar.setGame(gamemode);
        DesactivarPrincipal();
        add(paneljugar, BorderLayout.CENTER);
        revalidate();
        repaint();
    }  

    public void DesactivarPrincipal(){
        for (Component component : this.getComponents()) {
                component.setVisible(false);
                component.setEnabled(false);
        }
    }
    
    public void set(int gm){
        if(gm==1){
            gamemode=1;
        }else{
            gamemode=0;
        }
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