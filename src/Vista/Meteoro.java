/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.ImageIcon;

/**
 *
 * @author USER
 */
public class Meteoro extends Objeto {

    Ventana v;
    /**
     * 
     * @param v 
     */

    public Meteoro(Ventana v) {
        this.v = v;
    }

    @Override
    public void mover(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mover(int i, int j) {
        v.meteoro.setLocation(i, j);

    }

}
