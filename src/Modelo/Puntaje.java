/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Ventana;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
 
/**
 * 
 * @author USER
 */
public class Puntaje extends Thread {

    Ventana v;
    Modelo m;
    File archivo = new File("src/Utils/Puntaje.txt");
    FileInputStream entrada;
    FileWriter salida;
    PrintWriter linea;
    /**
     * 
     * @param v
     * @param m 
     */

    public Puntaje(Ventana v, Modelo m) {
        this.v = v;
        this.m = m;
    }

    @Override
    public void run() {
        m.flag = true;
        int i = 1;
        while (m.flag) {
            String punta = Integer.toString(i);
            v.puntaje.setText(punta);
            i += 2;
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Puntaje.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Guardar(archivo);
    }
    /**
     * 
     * @param archivo 
     */

    private void Guardar(File archivo) {
        try {

            salida = new FileWriter(archivo, true);
            linea = new PrintWriter(salida);
            String puntos = m.nombre + "   " + v.puntaje.getText();
            linea.println(puntos);
            linea.close();
            salida.close();
        } catch (Exception e) {
        }
    }
    
    public void Llenar() {
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
        v.tabla.setText(documento);
    }
}
