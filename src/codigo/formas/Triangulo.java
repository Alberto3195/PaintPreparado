/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.Color;

/**
 *
 * @author wellingtonvargasgonzalez
 */
public class Triangulo extends Forma{
      public Triangulo (int _posX, int _posY, int _lados, Color _color, boolean _relleno){
        //Inicializa el  contrusctor del triangulo
        super(_posX, _posY, 3, _color, _relleno);
    }
}

