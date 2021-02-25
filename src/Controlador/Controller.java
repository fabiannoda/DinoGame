/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo;
import Modelo.Salto;
import Vista.Ventana;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 *
 * @author USER
 */
public class Controller extends KeyAdapter {

    Ventana v;
    Modelo m;

    public Controller(Ventana v, Modelo m) {
        this.v = v;
        this.m = m;
        v.setVisible(true);
        this.v.addKeyListener(this);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            Salto s = new Salto(v, m);
            s.start();

        }
    }

}
