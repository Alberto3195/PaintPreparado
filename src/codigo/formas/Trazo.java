/*
 * 
 */
package codigo.formas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Stroke;

/**
 *
 * @author wellingtonvargasgonzalez
 */
public class Trazo extends Polygon{
    
    
    public int x, y;
  
    public Color color;

   
    public Trazo(int posX, int posY, Color _color ) {
        x = posX;
        y = posY;
        color = _color;
    }
    
    
    public void dibujate(Graphics2D g2, int posX, int posY ,int thickness) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(thickness));
        g2.drawLine(posX, posY, x, y);
        x = posX;
        y = posY;
        
    }
}
