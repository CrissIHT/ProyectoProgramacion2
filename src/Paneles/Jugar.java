package Paneles;


import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.lang.Math;

public class Jugar extends JPanel implements MouseMotionListener, MouseListener{
    private int gamemode;
    private GameTwo gt;
    private int selectedPieza;
    
    public Jugar(JPanel p) throws IOException{
        gt = new GameTwo();
        this.add(gt);
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);  
        
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        gt.paint(g);
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

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(SwingUtilities.isLeftMouseButton(e)){
            selectedPieza = gt.getClosestPieza(e.getX(), e.getY());
            System.out.println("Select = " + selectedPieza);
            gt.desencajar(selectedPieza);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if(Math.abs(e.getX() - 315) < 50){
            if(Math.abs(e.getY() - 295) < 50) gt.encajar(selectedPieza, 1);
        }
        if(Math.abs(e.getX() - 565) < 50){
            if(Math.abs(e.getY() - 295) < 50) gt.encajar(selectedPieza, 2);
        }
        if(Math.abs(e.getX() - 315) < 50){
            if(Math.abs(e.getY() - 545) < 50) gt.encajar(selectedPieza, 3);
        }
        if(Math.abs(e.getX() - 565) < 50){
            if(Math.abs(e.getY() - 545) < 50) gt.encajar(selectedPieza, 4);
        }
        selectedPieza = 0;
        System.out.println("Select = " + selectedPieza);
        gt.checkCompletado();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        gt.movePieza(selectedPieza, e.getX(), e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
       // System.out.println("X = " + e.getX());
       // System.out.println("Y = " + e.getY());
    }

}
