package Paneles;
import java.awt.*;
import java.util.Random;

abstract public class Pieza{
    protected int fila, columna;
    protected double x, y;
    protected Image imagen;

    public Pieza(Image imagen) {
        this.imagen = imagen;
        x = getRandomPos();
        y = getRandomPos();
        fila = 0;
        columna = 0;
    }
    public abstract void paint(Graphics g);
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point getPos(){
        int x = (int)this.x + 125;
        int y = (int)this.y + 125;
        
        return new Point(x,y);
    }
    public int getRandomPos(){
        return (int) ((Math.random() * (500 - 190)) + 190);
    }

}

class PiezaUL extends Pieza{
    public PiezaUL(Image imagen){
        super(imagen);
    }
    public void paint(Graphics g){
        //g.drawImage(PartesRompe.get(iter), i*(width/2)+190, j*(height/2)+170, null)
        g.drawImage(imagen, (int)x, (int)y, null);
        //System.out.println("se pinta imagen");
    }
}
class PiezaUR extends Pieza{
    public PiezaUR(Image imagen){
        super(imagen);
    }
    public void paint(Graphics g){
        g.drawImage(imagen, (int)x, (int)y, null);
        //System.out.println("se pinta imagen");
    }
}
class PiezaLL extends Pieza{
    public PiezaLL(Image imagen){
        super(imagen);
    }
    public void paint(Graphics g){
        g.drawImage(imagen, (int)x, (int)y, null);
        //System.out.println("se pinta imagen");
    }
}
class PiezaLR extends Pieza{
    public PiezaLR(Image imagen){
        super(imagen);
    }
    public void paint(Graphics g){
        g.drawImage(imagen, (int)x, (int)y, null);
        //System.out.println("se pinta imagen");
    }
}
