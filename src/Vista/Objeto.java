/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public abstract class Objeto extends JLabel implements Movible {

    public static ImageIcon carro = new ImageIcon("src/Utils/police.gif");
    public static ImageIcon escalaca = new ImageIcon(carro.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_DEFAULT));
    public static ImageIcon cactus = new ImageIcon("src/Utils/cactus.gif");
    public static ImageIcon escalacac = new ImageIcon(cactus.getImage().getScaledInstance(150, 150, java.awt.Image.SCALE_DEFAULT));
    public static ImageIcon caballo = new ImageIcon("src/Utils/caballo.gif");
    public static ImageIcon escalacaba = new ImageIcon(caballo.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_DEFAULT));
    public static ImageIcon meteoro = new ImageIcon("src/Utils/meteoro.gif");
    public static ImageIcon escalamet = new ImageIcon(meteoro.getImage().getScaledInstance(200, 200, java.awt.Image.SCALE_DEFAULT));

}
