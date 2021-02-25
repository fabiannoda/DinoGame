/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Ventana;
import static Vista.Ventana.objetos;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Mover extends Thread {

    Ventana v;
    Modelo m;
    public static int tipo;
    /**
     * 
     * @param v
     * @param m 
     */

    public Mover(Ventana v, Modelo m) {
        this.v = v;
        this.m = m;

    }

    @Override
    public void run() {
        m.flag = true;
        while (m.flag) {
            tipo = (int) (Math.random() * 4);
            int t = (int) ((Math.random() * 3) + 1.5);
            if (tipo == 3) {
                int i = 1000;
                for (int j = 0; j < 800; j++) {
                    objetos.get(tipo).mover(i, j);
                    i -= 2.5;
                    try {
                        Thread.sleep(2);

                    } catch (InterruptedException ex) {
                        Logger.getLogger(Mover.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

            } else {
                for (int i = 1500; i > -200; i -= t) {

                    objetos.get(tipo).mover(i);

                    try {
                        Thread.sleep(2);

                    } catch (InterruptedException ex) {
                        Logger.getLogger(Mover.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }

        }

    }

}
