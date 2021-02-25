/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import static Vista.Objeto.escalaca;
import static Vista.Objeto.escalacaba;
import static Vista.Objeto.escalacac;
import static Vista.Objeto.escalamet;
import java.awt.Color;

import java.util.ArrayList;

import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author USER
 */
public class Ventana extends JFrame {

    public JPanel p = new JPanel();
    public Dinosaurio dino = new Dinosaurio();
    public Objeto carrito = new Carro(this);
    public Objeto cactus = new Cactus(this);
    public Objeto caballo = new Caballo(this);
    public Objeto meteoro = new Meteoro(this);

    public ImageIcon n = new ImageIcon("src/Utils/nube.png");
    public ImageIcon nube = new ImageIcon(n.getImage().getScaledInstance(100, 100, java.awt.Image.SCALE_DEFAULT));
    public JLabel nubesita1 = new JLabel(nube);
    public JLabel nubesita2 = new JLabel(nube);

    private ImageIcon f = new ImageIcon("src/utils/fondo.jpg");
    private ImageIcon fondo = new ImageIcon(f.getImage().getScaledInstance(1360, 700, java.awt.Image.SCALE_DEFAULT));
    private JLabel fondito = new JLabel(fondo);

    public JLabel puntaje = new JLabel("00");

    public JTextArea tabla = new JTextArea();

    public static ArrayList<Objeto> objetos = new ArrayList<>();

    public Ventana() {
        this.setTitle("Dinosaurio");
        this.setLayout(null);
        this.setSize(2000, 1000);
        p.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(p);
        p.setLayout(null);
        p.setForeground(Color.WHITE);
        dino.setIcon(dino.escala);
        dino.setBounds(100, 350, 200, 200);
        p.add(dino);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        carrito.setIcon(escalaca);
        carrito.setBounds(1500, 410, 200, 200);
        p.add(carrito);

        cactus.setIcon(escalacac);
        cactus.setBounds(1500, 380, 200, 200);
        p.add(cactus);

        caballo.setIcon(escalacaba);
        caballo.setBounds(1500, 380, 200, 200);
        p.add(caballo);

        meteoro.setIcon(escalamet);
        meteoro.setBounds(1500, 320, 200, 200);
        p.add(meteoro);

        nubesita1.setBounds(1500, 100, 100, 100);
        p.add(nubesita1);

        nubesita2.setBounds(1500, 100, 100, 100);
        p.add(nubesita2);

        puntaje.setBounds(1000, 100, 50, 15);
        puntaje.setForeground(Color.red);
        p.add(puntaje);

        tabla.setBounds(1200, 10, 100, 200);
        tabla.setEnabled(false);
        tabla.setForeground(Color.white);
        tabla.setBackground(Color.BLACK);
        p.add(tabla);

        fondito.setBounds(0, 0, 1360, 700);
        p.add(fondito);

        objetos.add(carrito);
        objetos.add(cactus);
        objetos.add(caballo);
        objetos.add(meteoro);

    }

}
