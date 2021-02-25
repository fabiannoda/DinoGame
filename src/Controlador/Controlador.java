/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.PositionObserver;
import Vista.VantanaPuntaje;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author USER
 */
public class Controlador implements ActionListener {

    VantanaPuntaje v;
    PositionObserver po;

    public Controlador(VantanaPuntaje v, PositionObserver po) {
        this.v = v;
        this.po = po;
        v.setVisible(true);
        this.v.reiniciar.addActionListener(this);
        this.v.cancelar.addActionListener(this);
        po.llenar(v);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == v.cancelar) {
            po.cerrar();
            v.dispose();
        }
        if (e.getSource() == v.reiniciar) {
            po.reiniciar();
            v.dispose();
        }
    }

}
