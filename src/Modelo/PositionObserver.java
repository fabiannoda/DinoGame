/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Controlador;
import Controlador.Controller;
import Vista.Ventana;
import static Modelo.Mover.tipo;
import Vista.VantanaPuntaje;
import static Vista.Ventana.objetos;
import dinosaurio.Dinosaurio;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class PositionObserver extends Thread {

    Ventana v;
    Modelo m;

    int y1;
    FileInputStream entrada;
    File archivo = new File("src/Utils/Puntaje.txt");
    /**
     * 
     * @param v
     * @param m 
     */

    public PositionObserver(Ventana v, Modelo m) {
        this.v = v;
        this.m = m;

    }

    @Override
    public void run() {
        m.flag = true;
        while (m.flag) {

            int x = v.dino.getLocation().x + v.dino.getWidth();
            int y = v.dino.getLocation().y + v.dino.getHeight();
            int x1 = objetos.get(tipo).getLocation().x;
            switch (tipo) {
                case 0:
                    y1 = objetos.get(tipo).getLocation().y + 140;
                    break;
                case 1:
                    y1 = objetos.get(tipo).getLocation().y + 170;
                    break;
                case 2:
                    y1 = objetos.get(tipo).getLocation().y + 170;
                    break;
                case 3:
                    y1 = objetos.get(tipo).getLocation().y + 150;
            }

            int x2 = x1 + objetos.get(tipo).getWidth();
            int y2 = y1 + objetos.get(tipo).getHeight();

            if (x >= x1 && y >= y1 && x <= x2 && y <= y2) {
                m.flag = false;
                m.flagsal = false;
                JOptionPane.showMessageDialog(null, "Perdiste");
                VantanaPuntaje v2 = new VantanaPuntaje();
                Controlador c = new Controlador(v2, this);
                v.dispose();
            }

        }
    }

    public void cerrar() {
        System.exit(0);
    }

    public void reiniciar() {
        Ventana v = new Ventana();
        Modelo m = new Modelo(v);

    }
    /**
     * 
     * @param v 
     */

    public void llenar(VantanaPuntaje v) {
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
            int a;
            while ((a = entrada.read()) != -1) {
                char c = (char) a;
                documento += c;
            }
        } catch (Exception e) {
        }
        v.puntaje.setText(documento);
    }

}
