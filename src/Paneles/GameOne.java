
package Paneles;

import Clases.Tablero;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class GameOne extends JPanel{
    BufferedImage image;
    private Tablero t;
    Graphics2D g2d;
    public GameOne(){
        super();
        init();
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        g2d.drawImage(image, 0, 0, null);
    }
    
    public void init(){
        setBackground(Color.WHITE);
        image=new BufferedImage(500,500, BufferedImage.TYPE_INT_RGB);
        g2d=image.createGraphics();
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));
        
        MouseAdapter mouseHandler=new MouseAdapter() {
            private Point point= new Point();
            @Override
            public void mousePressed(MouseEvent e) {
                point.setLocation(e.getPoint());
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                g2d.drawLine(point.x, point.y, e.getX(), e.getY());
                point.setLocation(e.getPoint());
                repaint();
            }
        };
        
        addMouseListener(mouseHandler);
        addMouseMotionListener(mouseHandler);
        
    }
}
