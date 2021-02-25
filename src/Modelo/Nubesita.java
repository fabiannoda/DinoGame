/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Ventana;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Nubesita extends Thread {

    Ventana v;
    Modelo m;
    /**
     * 
     * @param v
     * @param m 
     */

    public Nubesita(Ventana v, Modelo m) {
        this.v = v;
        this.m = m;
    }

    @Override
    public void run() {
        m.flag = true;
        while (m.flag) {
            int i = 1500;
            int j = 1500;
            for (int k = 0; k < 1600; k++) {
                v.nubesita1.setLocation(j, v.nubesita1.getLocation().y);
                v.nubesita2.setLocation(i, v.nubesita2.getLocation().y);
                i--;
                j -= 2;

                try {
                    Thread.sleep(3);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Nubesita.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

}
