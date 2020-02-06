/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.util.Random;

/**
 *
 * @author wellingtonvargasgonzalez
 */
public class Spray extends Polygon {
    
    public int x;
    public int y;
    public Color color;
    
    Random random = new Random();
    int pintaRandom;
    
    public Spray (int posX, int posY, Color _color){
        x = posX;
        y = posY;
        color = _color;
        
    }
    
    public void dibujate(Graphics2D g2, int posX, int posY, int thickness) {
        g2.setColor(color);
        g2.setStroke(new BasicStroke(1));
        //Para que se aprecie
        thickness += 7;
        for (int i = 0; i < thickness; i++) {
            for (int j = 0; j < thickness; j++) {
                pintaRandom = random.nextInt(5);//Uno de cada 5
                if (pintaRandom == 3) {
                    g2.drawLine(x + i, y + j, x + i, y + j);
                }
            }

        }
        
        

    }
    
    
    
}
