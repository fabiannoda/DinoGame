/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Controller;
import Vista.Ventana;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Salto extends Thread {

    Ventana v;
    Modelo m;
    /**
     * 
     * @param v
     * @param m 
     */

    public Salto(Ventana v, Modelo m) {
        this.v = v;
        this.m = m;

    }

    @Override
    public void run() {
        m.flagsal = true;
        double t = 0;
        int x0 = 50, x = 0, y = 0, y0 = v.dino.getLocation().y;
        double a = Math.toRadians(90), pf = 0.0;
        int v = 80;
        this.v.dino.setIcon(this.v.dino.saltoes);

        while (m.flagsal) {
            x = (int) (x0 + (Math.cos(a) * v * t));
            x = x + x0;
            pf = (v * Math.sin(a) * t - 0.5 * 9.8 * t * t);

            y = (int) (y0 - pf);

            this.v.dino.setLocation(x, y);

            if (y > y0) {
                m.flagsal = false;
                this.v.dino.setIcon(this.v.dino.escala);
                this.v.dino.setLocation(100, 350);
            }

            t += 0.2;
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Salto.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
