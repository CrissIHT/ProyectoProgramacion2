package Clases;

import java.awt.Color;
import java.awt.Graphics;

public class Tablero {
    private int xpos, ypos;
    public Tablero(int x, int y){
        xpos=x;ypos=y;
    }
    
    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(xpos, ypos+150, 500, 500);
        g.setColor(Color.BLACK);
        g.drawRect(xpos, ypos+150, 500, 500);
    }
}