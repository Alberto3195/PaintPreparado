
package codigo.formas;

import java.awt.Color;

/**
 *
 * @author Jorge Cisneros
 */
public class Estrella extends Forma{
    
    public Estrella(int _posX, int _posY, int _lados, Color _color, boolean _relleno) {
        super(_posX, _posY, 120, _color, _relleno);
    }
    
    @Override
    public void calculaVertices (int _radio, double _giro){
        int n= 20;
        for (int i=0; i< npoints; i++){
            this.xpoints[i] = (int) (x + (_radio/(i%n +1))*Math.cos((2*Math.PI * i + _giro/(i%n +1))/npoints));
            this.ypoints[i] = (int) (y + (_radio/(i%n +1))*Math.sin((2*Math.PI * i + _giro/(i%n +1))/npoints));
        }
    }
    
}
