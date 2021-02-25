/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Vista.Objeto;

import javax.swing.ImageIcon;

/**
 *
 * @author USER
 */
public class Dinosaurio extends Objeto {

    public static ImageIcon image = new ImageIcon("src/Utils/walk.gif");
    public static ImageIcon escala = new ImageIcon(image.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_DEFAULT));

    public static ImageIcon salto = new ImageIcon("src/Utils/jump.gif");
    public static ImageIcon saltoes = new ImageIcon(salto.getImage().getScaledInstance(220, 220, java.awt.Image.SCALE_DEFAULT));

    @Override
    public void mover(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mover(int i, int j) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
