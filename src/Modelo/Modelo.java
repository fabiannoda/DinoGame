/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Ventana;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Modelo {

    public boolean flagsal;
    public boolean flag;
    public String nombre;

    Ventana v;
    /**
     * 
     * @param v 
     */

    public Modelo(Ventana v) {
        this.v = v;
        flag = true;
        flagsal = true;
        Mover mover = new Mover(v, this);
        PositionObserver po = new PositionObserver(v, this);
        Nubesita n = new Nubesita(v, this);
        Puntaje p = new Puntaje(v, this);
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del jugador", "Ingreso de nombres", 0);
        p.Llenar();
        p.start();
        mover.start();
        po.start();
        n.start();
    }
}
