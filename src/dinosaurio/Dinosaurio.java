/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dinosaurio;

import Vista.VantanaPuntaje;

import Controlador.Controller;
import Modelo.Modelo;
import Vista.Ventana;

/**
 *
 * @author Angel Nodarse
 * @serial 1032507704
 * @author Mateo Hoya
 * @serial 1001326526
 * @since 18/10/2018
 */
public class Dinosaurio {

    /**
     * @param args the command line arguments
     */
    public static Ventana v;
    public static Modelo m;
    public static Controller c;

    public static void main(String[] args) {
        // TODO code application logic here
        v = new Ventana();
        m = new Modelo(v);
        c = new Controller(v, m);

    }

}
