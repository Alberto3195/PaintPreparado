/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 *
 * @author wellingtonvargasgonzalez
 */
public class TampondeColor {
    public int tamponx = 0;
    public int tampony = 0;

    public TampondeColor(int posX, int posY, BufferedImage buffer) {
        this.tamponx = posX;
        this.tampony = posY;
    }

    public Color absorbeColor(int posX, int posY, BufferedImage buffer, Color color) {
        color = new Color(buffer.getRGB(posX, posY));
        return color;
    }

}
