package Paneles;

import Clases.Tablero;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.JOptionPane;


public class GameTwo extends JPanel{
    
    private PiezaUL UL;
    private PiezaUR UR;
    private PiezaLL LL;
    private PiezaLR LR;
    private Tablero t;
    private BufferedImage r1;
    private int width, height;
    private int casillas[] = {0, 0, 0, 0, 0};
    
    public GameTwo() throws IOException{
        t=new Tablero(190,20);
        initBoard();
    }
    public void paint(Graphics g){
        super.paint(g);
        t.paint(g);
    
        if(UL != null) UL.paint(g);
        if(UR != null) UR.paint(g);
        if(LL != null) LL.paint(g);
        if(LR != null) LR.paint(g);   
    }
    
    public void loadImage() throws IOException{
        r1= ImageIO.read(new File("Rompecabezas1.jpg"));
        width=r1.getWidth(null);
        height=r1.getHeight(null);
        
        Image ImUL = createImage(new FilteredImageSource(r1.getSource(),new CropImageFilter(0*(width/2),0*(height/2),width/2, height/2)));
        UL = new PiezaUL(ImUL);
        Image ImUR = createImage(new FilteredImageSource(r1.getSource(),new CropImageFilter(0*(width/2),1*(height/2),width/2, height/2)));
        UR = new PiezaUR(ImUR);
        Image ImLL = createImage(new FilteredImageSource(r1.getSource(),new CropImageFilter(1*(width/2),0*(height/2),width/2, height/2)));
        LL = new PiezaLL(ImLL);
        Image ImLR = createImage(new FilteredImageSource(r1.getSource(),new CropImageFilter(1*(width/2),1*(height/2),width/2, height/2)));    
        LR = new PiezaLR(ImLR);
    }
    
    public void initBoard() throws IOException{
        loadImage();
        setPreferredSize(new Dimension(width,height+2));
    }

    public int getClosestPieza(int x, int y){
        Pieza p = UL;
        Point mPos = new Point(x,y);
        Point ULPos = UL.getPos();
        Point URPos = UR.getPos();
        Point LLPos = LL.getPos();
        Point LRPos = LR.getPos();
        
        double distUL = distEntre2Puntos(mPos, ULPos);
        if(distUL < 125) return 1;
        double distUR = distEntre2Puntos(mPos, URPos);
        if(distUR < 125) return 2;
        double distLL = distEntre2Puntos(mPos, LLPos);
        if(distLL < 125) return 3;
        double distLR = distEntre2Puntos(mPos, LRPos);
        if(distLR < 125) return 4;
        
        return 0;
    }
    public double distEntre2Puntos(Point uno, Point dos){
        double d=Math.sqrt(
               ((double)uno.x-(double)dos.x)*
               ((double)uno.x-(double)dos.x)+
               ((double)uno.y-(double)dos.y)* 
               ((double)uno.y-(double)dos.y)
            );
        return d;
    }
    public void movePieza(int p, int x, int y){
        if(p == 1) UL.setXY(x-125, y-125);
        else if (p == 2) UR.setXY(x-125, y-125);
        else if (p == 3) LL.setXY(x-125, y-125);
        else if (p == 4) LR.setXY(x-125, y-125);
        
    }   
    public void movePieza(int p, Point pos){
        if(p == 1) UL.setXY(pos.x-125, pos.y-125);
        else if (p == 2) UR.setXY(pos.x-125, pos.y-125);
        else if (p == 3) LL.setXY(pos.x-125, pos.y-125);
        else if (p == 4) LR.setXY(pos.x-125, pos.y-125);       
    }  
    public void encajar(int p, int c){
        if(casillas[c] == 0){
            casillas[c] = p;
            if(c == 1) movePieza(p, 315, 295);
            if(c == 2) movePieza(p, 565, 295);
            if(c == 3) movePieza(p, 315, 545);
            if(c == 4) movePieza(p, 565, 545);
        }
        else swapPos(p, casillas[c]);
    }
    public void desencajar(int p){
        for(int i=1;i<5;i++){
            if(casillas[i] == p) casillas[i] = 0;
        }
    }
    public void checkCompletado(){      
        if(casillas[1] != 1)return;
        if(casillas[2] != 3)return;
        if(casillas[3] != 2)return;
        if(casillas[4] != 4)return;

        System.out.println("COMPLETADO");
        
        JOptionPane.showMessageDialog(null, "Resolviste el puzzle", "FELICIDADES!", JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    public void swapPos(int pa, int pb){
        Point temp = getpPos(pa);
        movePieza(pa, getpPos(pb));
        movePieza(pb, temp);
    }
    public Point getpPos(int p){
        switch(p){
            case 1:
                return UL.getPos();
            case 2:
                return UR.getPos();
            case 3:
                return LL.getPos();
            case 4:
                return LR.getPos();
            default:
                return null;
        }
    }
}
