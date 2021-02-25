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
public class Carro extends Objeto {

    Ventana v;

    /**
     *
     * @param v
     */
    public Carro(Ventana v) {
        this.v = v;
    }

    @Override
    public void mover(int i) {
        v.carrito.setLocation(i, 410);

    }

    @Override
    public void mover(int i, int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
