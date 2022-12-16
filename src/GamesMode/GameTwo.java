package GamesMode;

import Clases.Tablero;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.CropImageFilter;
import java.awt.image.FilteredImageSource;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

import javax.swing.JPanel;


public class GameTwo extends JPanel{
    
    private Tablero t;
    private BufferedImage r1;
    private int width, height;
    private Image part1, part2;
    private int x=190,y=0;
    private ArrayList<Image> PartesRompe = new ArrayList <>();
    
    public GameTwo() throws IOException{
        t=new Tablero(190,20);
        initBoard();
    }
    public void paint(Graphics g){
        t.paint(g);
        int iter=0;
        for(int i=0; i<2; i++){
            for(int j=0;j<2;j++){
                g.drawImage(PartesRompe.get(iter), i*(width/2)+190, j*(height/2)+170, null);
                iter++;
            }
        }
        //g.drawImage(part1, 190, 170, null);
        //g.drawImage(part2, 190, height/2+2+170, null);
        
    }
    
    public void loadImage() throws IOException{
        r1= ImageIO.read(new File("Rompecabezas1.jpg"));
        width=r1.getWidth(null);
        height=r1.getHeight(null);
        
        //part1=createImage(new FilteredImageSource(r1.getSource(), new CropImageFilter(0,0,width,height/2)));
        //part2=createImage(new FilteredImageSource(r1.getSource(), new CropImageFilter(0,height/2,width,height/2)));
        
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                Image romp= createImage(new FilteredImageSource(r1.getSource(),new CropImageFilter(j*(width/2),i*(height/2),width/2, height/2)));
                PartesRompe.add(romp);
            }
        }
        
    }
    
    public void initBoard() throws IOException{
        loadImage();
        setPreferredSize(new Dimension(width,height+2));
    }
}
