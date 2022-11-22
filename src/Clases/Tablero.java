package Clases;

public class Tablero {
    private int xpos, ypos;
    public Tablero(int x, int y){
        xpos=x;y=ypos;
    }
    
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(xpos, ypos+150, 500, 500);
        g.setColor(Color.ORANGE);
        g.drawRect(xpos, ypos+150, 500, 500);
    }
}
