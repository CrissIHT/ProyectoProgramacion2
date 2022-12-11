package Paneles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComoJugar extends JPanel{
    private JLabel back, manual;
    private String texto = "<html><body>Modo de juego uno<br><br>  las piezas apareceran en su lugar, pero con la imagen del rompecabezas en blanco. La imagen general del puzzle será una linea de color que usted creará con ayuda del mouse y deberá quedar repartida sobre las piezas <br><br> Modo de juego dos <br><br> Al iniciar el juego, las piezas aparecerán distriubuidas aleatoriamente fuera del tablero. A diferencia del primer modo de juego, aquí unicamente debemos enfocarnos en armar correctamente nuestro rompecabezas </body></html>";
    public ComoJugar(JPanel p){
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        
        back=new JLabel("Volver al menú");
        back.setBounds(60,40,150,45);
        back.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,20));
        back.setForeground(Color.WHITE);
        add(back);    
        
        manual=new JLabel(texto);
        manual.setBounds(60,150 ,800,500);
        manual.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,25));
        manual.setForeground(Color.WHITE);
        add(manual);        
        
        back.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                
                for (Component component : p.getComponents()) {
                component.setVisible(true);
                component.setEnabled(true);
                backPanel();
                revalidate();
                repaint();
                }
            }
        });
        
    }
    public void backPanel(){
        for (Component component : this.getComponents()) {
                component.setVisible(false);
                component.setEnabled(false);
                }
    }
}
